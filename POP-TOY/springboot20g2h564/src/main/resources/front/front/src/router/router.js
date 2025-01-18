import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import payList from '../pages/pay'

import shejishiList from '../pages/shejishi/list'
import shejishiDetail from '../pages/shejishi/detail'
import shejishiAdd from '../pages/shejishi/add'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import shoubanfenleiList from '../pages/shoubanfenlei/list'
import shoubanfenleiDetail from '../pages/shoubanfenlei/detail'
import shoubanfenleiAdd from '../pages/shoubanfenlei/add'
import shoubanshangpinList from '../pages/shoubanshangpin/list'
import shoubanshangpinDetail from '../pages/shoubanshangpin/detail'
import shoubanshangpinAdd from '../pages/shoubanshangpin/add'
import shoubandingzhiList from '../pages/shoubandingzhi/list'
import shoubandingzhiDetail from '../pages/shoubandingzhi/detail'
import shoubandingzhiAdd from '../pages/shoubandingzhi/add'
import zaixianzixunList from '../pages/zaixianzixun/list'
import zaixianzixunDetail from '../pages/zaixianzixun/detail'
import zaixianzixunAdd from '../pages/zaixianzixun/add'
import shejifanganList from '../pages/shejifangan/list'
import shejifanganDetail from '../pages/shejifangan/detail'
import shejifanganAdd from '../pages/shejifangan/add'
import shejituzhiList from '../pages/shejituzhi/list'
import shejituzhiDetail from '../pages/shejituzhi/detail'
import shejituzhiAdd from '../pages/shejituzhi/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discussshoubanshangpinList from '../pages/discussshoubanshangpin/list'
import discussshoubanshangpinDetail from '../pages/discussshoubanshangpin/detail'
import discussshoubanshangpinAdd from '../pages/discussshoubanshangpin/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'shejishi',
					component: shejishiList
				},
				{
					path: 'shejishiDetail',
					component: shejishiDetail
				},
				{
					path: 'shejishiAdd',
					component: shejishiAdd
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'shoubanfenlei',
					component: shoubanfenleiList
				},
				{
					path: 'shoubanfenleiDetail',
					component: shoubanfenleiDetail
				},
				{
					path: 'shoubanfenleiAdd',
					component: shoubanfenleiAdd
				},
				{
					path: 'shoubanshangpin',
					component: shoubanshangpinList
				},
				{
					path: 'shoubanshangpinDetail',
					component: shoubanshangpinDetail
				},
				{
					path: 'shoubanshangpinAdd',
					component: shoubanshangpinAdd
				},
				{
					path: 'shoubandingzhi',
					component: shoubandingzhiList
				},
				{
					path: 'shoubandingzhiDetail',
					component: shoubandingzhiDetail
				},
				{
					path: 'shoubandingzhiAdd',
					component: shoubandingzhiAdd
				},
				{
					path: 'zaixianzixun',
					component: zaixianzixunList
				},
				{
					path: 'zaixianzixunDetail',
					component: zaixianzixunDetail
				},
				{
					path: 'zaixianzixunAdd',
					component: zaixianzixunAdd
				},
				{
					path: 'shejifangan',
					component: shejifanganList
				},
				{
					path: 'shejifanganDetail',
					component: shejifanganDetail
				},
				{
					path: 'shejifanganAdd',
					component: shejifanganAdd
				},
				{
					path: 'shejituzhi',
					component: shejituzhiList
				},
				{
					path: 'shejituzhiDetail',
					component: shejituzhiDetail
				},
				{
					path: 'shejituzhiAdd',
					component: shejituzhiAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discussshoubanshangpin',
					component: discussshoubanshangpinList
				},
				{
					path: 'discussshoubanshangpinDetail',
					component: discussshoubanshangpinDetail
				},
				{
					path: 'discussshoubanshangpinAdd',
					component: discussshoubanshangpinAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
