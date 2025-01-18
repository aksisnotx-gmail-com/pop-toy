import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import aboutus from '@/views/modules/aboutus/list'
    import shoubanshangpin from '@/views/modules/shoubanshangpin/list'
    import shejifangan from '@/views/modules/shejifangan/list'
    import shejishi from '@/views/modules/shejishi/list'
    import forum from '@/views/modules/forum/list'
    import shoubanfenlei from '@/views/modules/shoubanfenlei/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shejituzhi from '@/views/modules/shejituzhi/list'
    import shoubandingzhi from '@/views/modules/shoubandingzhi/list'
    import messages from '@/views/modules/messages/list'
    import orders from '@/views/modules/orders/list'
    import zaixianzixun from '@/views/modules/zaixianzixun/list'
    import discussshoubanshangpin from '@/views/modules/discussshoubanshangpin/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/shoubanshangpin',
        name: '手办商品',
        component: shoubanshangpin
      }
      ,{
	path: '/shejifangan',
        name: '设计方案',
        component: shejifangan
      }
      ,{
	path: '/shejishi',
        name: '设计师',
        component: shejishi
      }
      ,{
	path: '/forum',
        name: '手办论坛',
        component: forum
      }
      ,{
	path: '/shoubanfenlei',
        name: '手办分类',
        component: shoubanfenlei
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shejituzhi',
        name: '设计图纸',
        component: shejituzhi
      }
      ,{
	path: '/shoubandingzhi',
        name: '手办定制',
        component: shoubandingzhi
      }
      ,{
	path: '/messages',
        name: '留言板',
        component: messages
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/zaixianzixun',
        name: '在线咨询',
        component: zaixianzixun
      }
      ,{
	path: '/discussshoubanshangpin',
        name: '手办商品评论',
        component: discussshoubanshangpin
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
