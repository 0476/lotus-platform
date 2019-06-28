package com.ailikes.lotus.user.service;

import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.ailikes.lotus.common.grpc.lib.BizGrpc;
import com.ailikes.lotus.common.grpc.lib.BizOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ailikes.lotus.common.core.model.system.LoginAppUser;
import com.ailikes.lotus.common.core.model.system.SysPermission;
import com.ailikes.lotus.common.core.model.system.SysRole;
import com.ailikes.lotus.common.core.model.system.SysUser;
import com.ailikes.lotus.user.dao.SysUserDao;
import com.ailikes.lotus.user.dao.SysUserRoleDao;

import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@GrpcService(BizOuterClass.class) //grpc 服务端
public class UserLoginService extends BizGrpc.BizImplBase {

	private static final Logger log = LoggerFactory.getLogger(UserLoginService.class);

	@Autowired
	private SysUserDao sysUserDao;
	@Autowired
	private SysPermissionService sysPermissionService;
	@Autowired
	private SysUserRoleDao userRoleDao;

	@Resource
	private ObjectMapper objectMapper; // springmvc启动时自动装配json处理类

	@Override
	public void process(BizOuterClass.GprcRequest request, StreamObserver<BizOuterClass.GprcReply> responseObserver) {

		String message = "{}";
		try {
			SysUser sysUser = sysUserDao.findUserByUsername(request.getName());
			if (sysUser != null) {
				LoginAppUser loginAppUser = new LoginAppUser();
				BeanUtils.copyProperties(sysUser, loginAppUser);

				Set<SysRole> sysRoles = userRoleDao.findRolesByUserId(sysUser.getId());
				loginAppUser.setSysRoles(sysRoles);// 设置角色

				if (!CollectionUtils.isEmpty(sysRoles)) {
					Set<Long> roleIds = sysRoles.parallelStream().map(r -> r.getId()).collect(Collectors.toSet());
					Set<SysPermission> sysPermissions = sysPermissionService.findByRoleIds(roleIds);
					if (!CollectionUtils.isEmpty(sysPermissions)) {
						Set<String> permissions = sysPermissions.parallelStream().map(p -> p.getPermission())
								.collect(Collectors.toSet());

						loginAppUser.setPermissions(permissions);// 设置权限集合
					}
					message = objectMapper.writeValueAsString(loginAppUser);
				}
			}
		} catch (Exception e) {

		}

		final BizOuterClass.GprcReply.Builder replyBuilder = BizOuterClass.GprcReply.newBuilder().setMessage(message);
		responseObserver.onNext(replyBuilder.build());
		responseObserver.onCompleted();
		log.info("Returning " + message);
	}
}