//add by owen 修复 path 无法引用http://页面的问题 begin
String.prototype.startWith = function(str) {
	if (str == null || str == "" || this.length == 0
			|| str.length > this.length)
		return false;
	if (this.substr(0, str.length) == str)
		return true;
	else
		return false;
	return true;
}
layui.define(['config', 'admin', 'layer', 'laytpl', 'element', 'form'], function (exports) {
    var $ = layui.$;
    var config = layui.config;
    var admin = layui.admin;
    var layer = layui.layer;
    var laytpl = layui.laytpl;
    var element = layui.element;
    var form = layui.form;
    
    var index = {
        // 路由注册
        initRouter: function () {
            index.regRouter(admin.getTempData("menus"));
            // index.regRouter(config.menus);
            Q.reg('home', function () {
                var menuPath = 'pages/home.html'
                index.loadView('home', menuPath, '首页');
            });
            Q.reg('teacher', function () {
                var menuPath = 'pages/teacher.html'
                index.loadView('teacher', menuPath, '师资');
            });
            Q.reg('student', function () {
                var menuPath = 'pages/student.html'
                index.loadView('student', menuPath, '同学');
            });
            //首页注册
            Q.init({
                index: 'home'
            });
        },
        // 使用递归循环注册
        regRouter: function (menus) {
            $.each(menus, function (i, data) {
                if (data.url && data.url.indexOf('#!') == 0) {
                    Q.reg(data.url.substring(2), function () {
                        //临时保存url
                        data.path.startWith("http://") ?  admin.putTempData("params",data.path) : null ;
                        var menuId = data.url.substring(2);
                        //add by owen 修复 path 无法引用http://页面的问题
                        var menuPath = data.path.startWith("http://") ? 'pages/tpl/iframe.html' : 'pages/' + data.path
                        index.loadView(menuId, menuPath, data.name);
                    });
                }
                if (data.subMenus) {
                    index.regRouter(data.subMenus);
                }
            });
        },
        // 路由加载组件
        loadView: function (menuId, menuPath,menuName) {
            var contentDom = '.layui-layout-admin .layui-body';
            admin.showLoading('.layui-layout-admin .layui-body');
            var flag;  // 选项卡是否添加
            flag =   (menuPath.startWith("http://") || menuPath.startWith("https://")) ? false : true ;
            // 判断是否开启了选项卡功能
            if (flag) {
                $(contentDom).load(menuPath, function () {
                    admin.isRefresh = false;
                });
            } else {
                admin.removeLoading('.layui-layout-admin .layui-body');
            }
            admin.activeNav(Q.lash);
        },
        // 从服务器获取登录用户的信息
        getUser: function (success) {
            layer.load(2);
            admin.req('api-auth/oauth/userinfo', {}, function (data) {
                layer.closeAll('loading');
                if (200 == data.resp_code) {
                    config.putUser(data.user);
                    admin.putTempData("permissions",data.permissions);
                    success(data.user);
                } else {
                    layer.msg('获取用户失败', {icon: 2});
                    config.removeToken();
                    location.replace('login.html');
                    return ;
                }
            }, 'GET');
        },
        // 页面元素绑定事件监听
        bindEvent: function () {
            // 退出登录
            $('#btnLogout').click(function () {
                layer.confirm('确定退出登录？', function () {
                    //通过认证中心 tuic
                    admin.req('api-auth/oauth/remove/token?access_token='+config.getToken().access_token, {}, function (data) {
                            config.removeToken();
                            location.replace('login.html');
                    }, 'POST');
                });
            });
            // 修改密码
            $('#setPsw').click(function () {
                admin.popupRight('pages/tpl/password.html');
            });
            // 个人信息
            $('#setInfo').click(function () {
                Q.go('myInfo');
            });
            // 消息
            $('#btnMessage').click(function () {
                admin.popupRight('pages/tpl/message.html');
            });
        },
        // 打开新页面
        openNewTab: function (param) {
            var url = param.url;
            var title = param.title;
            var menuId = param.menuId;
            if (!menuId) {
                menuId = url.replace(/[?:=&/]/g, '_');
            }
            index.loadView(menuId, url, title);
        },
        // 关闭选项卡
        closeTab: function (menuId) {
            element.tabDelete('admin-pagetabs', menuId);
        }
    };

    // tab选项卡切换监听
    element.on('tab(admin-pagetabs)', function (data) {
        var layId = $(this).attr('lay-id');
        Q.go(layId);
    });

    exports('index', index);
});
