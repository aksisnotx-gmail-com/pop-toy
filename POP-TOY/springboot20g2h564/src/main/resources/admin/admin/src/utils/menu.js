const menu = {
    list() {
        return [
            {
                "backMenu": [
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "手办定制",
                                    "在线咨询"
                                ],
                                "appFrontIcon": "cuIcon-newshot",
                                "buttons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "设计师",
                                "menuJump": "列表",
                                "tableName": "shejishi"
                            }
                        ],
                        "menu": "设计师管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "appFrontIcon": "cuIcon-flashlightopen",
                                "buttons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "用户",
                                "menuJump": "列表",
                                "tableName": "yonghu"
                            }
                        ],
                        "menu": "用户管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "appFrontIcon": "cuIcon-addressbook",
                                "buttons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "手办分类",
                                "menuJump": "列表",
                                "tableName": "shoubanfenlei"
                            }
                        ],
                        "menu": "手办分类管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "查看评论"
                                ],
                                "appFrontIcon": "cuIcon-brand",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除",
                                    "查看评论",
                                    "新增"
                                ],
                                "menu": "手办商品",
                                "menuJump": "列表",
                                "tableName": "shoubanshangpin"
                            }
                        ],
                        "menu": "手办商品管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "设计方案"
                                ],
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "手办定制",
                                "menuJump": "列表",
                                "tableName": "shoubandingzhi"
                            }
                        ],
                        "menu": "手办定制管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "审核"
                                ],
                                "appFrontIcon": "cuIcon-brand",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "在线咨询",
                                "menuJump": "列表",
                                "tableName": "zaixianzixun"
                            }
                        ],
                        "menu": "在线咨询管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "审核",
                                    "设计图纸"
                                ],
                                "appFrontIcon": "cuIcon-phone",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "设计方案",
                                "menuJump": "列表",
                                "tableName": "shejifangan"
                            }
                        ],
                        "menu": "设计方案管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "支付"
                                ],
                                "appFrontIcon": "cuIcon-pay",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "设计图纸",
                                "menuJump": "列表",
                                "tableName": "shejituzhi"
                            }
                        ],
                        "menu": "设计图纸管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "查看",
                                    "修改",
                                    "回复",
                                    "删除"
                                ],
                                "appFrontIcon": "cuIcon-message",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "回复",
                                    "删除"
                                ],
                                "menu": "留言板",
                                "tableName": "messages"
                            }
                        ],
                        "menu": "留言板"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "appFrontIcon": "cuIcon-group",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "手办论坛",
                                "tableName": "forum"
                            }
                        ],
                        "menu": "手办论坛"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "查看",
                                    "修改"
                                ],
                                "appFrontIcon": "cuIcon-full",
                                "buttons": [
                                    "查看",
                                    "修改"
                                ],
                                "menu": "关于我们",
                                "tableName": "aboutus"
                            },
                            {
                                "allButtons": [
                                    "查看",
                                    "修改"
                                ],
                                "appFrontIcon": "cuIcon-brand",
                                "buttons": [
                                    "查看",
                                    "修改"
                                ],
                                "menu": "系统简介",
                                "tableName": "systemintro"
                            }
                        ],
                        "menu": "系统管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "appFrontIcon": "cuIcon-goods",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "轮播图",
                                "tableName": "config"
                            }
                        ],
                        "menu": "轮播图管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "导出",
                                    "日销量",
                                    "月销量",
                                    "年销量",
                                    "品销量",
                                    "类销量",
                                    "日销额",
                                    "月销额",
                                    "年销额",
                                    "品销额",
                                    "类销额",
                                    "确认收货",
                                    "物流"
                                ],
                                "appFrontIcon": "cuIcon-vipcard",
                                "buttons": [
                                    "查看",
                                    "删除"
                                ],
                                "menu": "已发货订单",
                                "tableName": "orders/已发货"
                            },
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "导出",
                                    "日销量",
                                    "月销量",
                                    "年销量",
                                    "品销量",
                                    "类销量",
                                    "日销额",
                                    "月销额",
                                    "年销额",
                                    "品销额",
                                    "类销额"
                                ],
                                "appFrontIcon": "cuIcon-pic",
                                "buttons": [
                                    "查看",
                                    "删除"
                                ],
                                "menu": "未支付订单",
                                "tableName": "orders/未支付"
                            },
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "导出",
                                    "日销量",
                                    "月销量",
                                    "年销量",
                                    "品销量",
                                    "类销量",
                                    "日销额",
                                    "月销额",
                                    "年销额",
                                    "品销额",
                                    "类销额",
                                    "发货",
                                    "物流",
                                    "核销"
                                ],
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": [
                                    "查看",
                                    "删除",
                                    "发货"
                                ],
                                "menu": "已支付订单",
                                "tableName": "orders/已支付"
                            },
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "导出",
                                    "日销量",
                                    "月销量",
                                    "年销量",
                                    "品销量",
                                    "类销量",
                                    "日销额",
                                    "月销额",
                                    "年销额",
                                    "品销额",
                                    "类销额",
                                    "物流",
                                    "退货审核"
                                ],
                                "appFrontIcon": "cuIcon-pic",
                                "buttons": [
                                    "查看",
                                    "删除",
                                    "日销量",
                                    "月销量",
                                    "品销量",
                                    "类销量",
                                    "日销额",
                                    "月销额",
                                    "退货审核"
                                ],
                                "menu": "已完成订单",
                                "tableName": "orders/已完成"
                            },
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "导出",
                                    "日销量",
                                    "月销量",
                                    "年销量",
                                    "品销量",
                                    "类销量",
                                    "日销额",
                                    "月销额",
                                    "年销额",
                                    "品销额",
                                    "类销额"
                                ],
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": [
                                    "查看",
                                    "删除"
                                ],
                                "menu": "已取消订单",
                                "tableName": "orders/已取消"
                            },
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "导出",
                                    "日销量",
                                    "月销量",
                                    "年销量",
                                    "品销量",
                                    "类销量",
                                    "日销额",
                                    "月销额",
                                    "年销额",
                                    "品销额",
                                    "类销额",
                                    "物流"
                                ],
                                "appFrontIcon": "cuIcon-wenzi",
                                "buttons": [
                                    "查看",
                                    "删除"
                                ],
                                "menu": "已退款订单",
                                "tableName": "orders/已退款"
                            }
                        ],
                        "menu": "订单管理"
                    }
                ],
                "frontMenu": [
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "手办定制",
                                    "在线咨询"
                                ],
                                "appFrontIcon": "cuIcon-goods",
                                "buttons": [
                                    "查看",
                                    "手办定制",
                                    "在线咨询"
                                ],
                                "menu": "设计师列表",
                                "menuJump": "列表",
                                "tableName": "shejishi"
                            }
                        ],
                        "menu": "设计师模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "查看评论"
                                ],
                                "appFrontIcon": "cuIcon-paint",
                                "buttons": [
                                    "查看",
                                    "查看评论"
                                ],
                                "menu": "手办商品列表",
                                "menuJump": "列表",
                                "tableName": "shoubanshangpin"
                            }
                        ],
                        "menu": "手办商品模块"
                    }
                ],
                "hasBackLogin": "是",
                "hasBackRegister": "否",
                "hasFrontLogin": "否",
                "hasFrontRegister": "否",
                "roleName": "管理员",
                "tableName": "users"
            },
            {
                "backMenu": [
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "设计方案"
                                ],
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": [
                                    "查看",
                                    "设计方案"
                                ],
                                "menu": "手办定制",
                                "menuJump": "列表",
                                "tableName": "shoubandingzhi"
                            }
                        ],
                        "menu": "手办定制管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "审核"
                                ],
                                "appFrontIcon": "cuIcon-brand",
                                "buttons": [
                                    "查看",
                                    "审核"
                                ],
                                "menu": "在线咨询",
                                "menuJump": "列表",
                                "tableName": "zaixianzixun"
                            }
                        ],
                        "menu": "在线咨询管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "审核",
                                    "设计图纸"
                                ],
                                "appFrontIcon": "cuIcon-phone",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除",
                                    "设计图纸"
                                ],
                                "menu": "设计方案",
                                "menuJump": "列表",
                                "tableName": "shejifangan"
                            }
                        ],
                        "menu": "设计方案管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "支付"
                                ],
                                "appFrontIcon": "cuIcon-pay",
                                "buttons": [
                                    "查看",
                                    "修改",
                                    "删除"
                                ],
                                "menu": "设计图纸",
                                "menuJump": "列表",
                                "tableName": "shejituzhi"
                            }
                        ],
                        "menu": "设计图纸管理"
                    }
                ],
                "frontMenu": [
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "手办定制",
                                    "在线咨询"
                                ],
                                "appFrontIcon": "cuIcon-goods",
                                "buttons": [
                                    "查看",
                                    "手办定制",
                                    "在线咨询"
                                ],
                                "menu": "设计师列表",
                                "menuJump": "列表",
                                "tableName": "shejishi"
                            }
                        ],
                        "menu": "设计师模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "查看评论"
                                ],
                                "appFrontIcon": "cuIcon-paint",
                                "buttons": [
                                    "查看",
                                    "查看评论"
                                ],
                                "menu": "手办商品列表",
                                "menuJump": "列表",
                                "tableName": "shoubanshangpin"
                            }
                        ],
                        "menu": "手办商品模块"
                    }
                ],
                "hasBackLogin": "是",
                "hasBackRegister": "是",
                "hasFrontLogin": "否",
                "hasFrontRegister": "否",
                "roleName": "设计师",
                "tableName": "shejishi"
            },
            {
                "backMenu": [
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "设计方案"
                                ],
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": [
                                    "查看"
                                ],
                                "menu": "手办定制",
                                "menuJump": "列表",
                                "tableName": "shoubandingzhi"
                            }
                        ],
                        "menu": "手办定制管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "审核"
                                ],
                                "appFrontIcon": "cuIcon-brand",
                                "buttons": [
                                    "查看"
                                ],
                                "menu": "在线咨询",
                                "menuJump": "列表",
                                "tableName": "zaixianzixun"
                            }
                        ],
                        "menu": "在线咨询管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "审核",
                                    "设计图纸"
                                ],
                                "appFrontIcon": "cuIcon-phone",
                                "buttons": [
                                    "审核",
                                    "查看"
                                ],
                                "menu": "设计方案",
                                "menuJump": "列表",
                                "tableName": "shejifangan"
                            }
                        ],
                        "menu": "设计方案管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "支付"
                                ],
                                "appFrontIcon": "cuIcon-pay",
                                "buttons": [
                                    "支付",
                                    "查看"
                                ],
                                "menu": "设计图纸",
                                "menuJump": "列表",
                                "tableName": "shejituzhi"
                            }
                        ],
                        "menu": "设计图纸管理"
                    }
                ],
                "frontMenu": [
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "手办定制",
                                    "在线咨询"
                                ],
                                "appFrontIcon": "cuIcon-goods",
                                "buttons": [
                                    "查看",
                                    "手办定制",
                                    "在线咨询"
                                ],
                                "menu": "设计师列表",
                                "menuJump": "列表",
                                "tableName": "shejishi"
                            }
                        ],
                        "menu": "设计师模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": [
                                    "新增",
                                    "查看",
                                    "修改",
                                    "删除",
                                    "查看评论"
                                ],
                                "appFrontIcon": "cuIcon-paint",
                                "buttons": [
                                    "查看",
                                    "查看评论"
                                ],
                                "menu": "手办商品列表",
                                "menuJump": "列表",
                                "tableName": "shoubanshangpin"
                            }
                        ],
                        "menu": "手办商品模块"
                    }
                ],
                "hasBackLogin": "否",
                "hasBackRegister": "否",
                "hasFrontLogin": "是",
                "hasFrontRegister": "是",
                "roleName": "用户",
                "tableName": "yonghu"
            }
        ]
    }
}
export default menu;

