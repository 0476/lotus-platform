package com.ailikes.lotus.user.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.ailikes.lotus.common.core.model.system.SysMenu;
import com.ailikes.lotus.user.dao.SysMenuDao;
import com.ailikes.lotus.user.dao.SysRoleMenuDao;
import com.ailikes.lotus.user.service.SysMenuService;


@Service
public class SysMenuServiceImpl implements SysMenuService {

	private static final Logger log = LoggerFactory.getLogger(SysMenuServiceImpl.class);

	@Autowired
	private SysMenuDao menuDao;
 	@Autowired
	private SysRoleMenuDao roleMenuDao; 

	@Transactional
	@Override
	public void save(SysMenu menu) {
		menu.setCreateTime(new Date());
		menu.setUpdateTime(menu.getCreateTime());

		menuDao.save(menu);
		log.info("新增菜单：{}", menu);
	}

	@Transactional
	@Override
	public void update(SysMenu menu) {
		menu.setUpdateTime(new Date());

		menuDao.updateByOps(menu);
		log.info("修改菜单：{}", menu);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		SysMenu menu = menuDao.findById(id);

		menuDao.deleteByParentId(menu.getId());
		menuDao.delete(id);

		log.info("删除菜单：{}", menu);
	}

	@Transactional
	@Override
	public void setMenuToRole(Long roleId, Set<Long> menuIds) {
		roleMenuDao.delete(roleId, null);

		if (!CollectionUtils.isEmpty(menuIds)) {
			menuIds.forEach(menuId -> {
				roleMenuDao.save(roleId, menuId);
			});
		}
	}

	@Override
	public List<SysMenu> findByRoles(Set<Long> roleIds) {
		return roleMenuDao.findMenusByRoleIds(roleIds);
	}

	@Override
	public List<SysMenu> findAll() {
		return menuDao.findAll();
	}

	@Override
	public SysMenu findById(Long id) {
		return menuDao.findById(id);
	}

	@Override
	public Set<Long> findMenuIdsByRoleId(Long roleId) {
		return roleMenuDao.findMenuIdsByRoleId(roleId);
	}

	@Override
	public List<SysMenu> findOnes() {
		return menuDao.findOnes();
	}

}
