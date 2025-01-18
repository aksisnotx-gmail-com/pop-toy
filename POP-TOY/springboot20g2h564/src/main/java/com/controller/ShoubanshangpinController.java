package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;
import com.entity.OrdersEntity;
import com.service.OrdersService;

import com.entity.ShoubanshangpinEntity;
import com.entity.view.ShoubanshangpinView;

import com.service.ShoubanshangpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 手办商品
 * 后端接口
 * @author
 * @email
 * @date 2050-04-27 11:01:35
 */
@RestController
@RequestMapping("/shoubanshangpin")
public class ShoubanshangpinController {
    @Autowired
    private ShoubanshangpinService shoubanshangpinService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;






    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShoubanshangpinEntity shoubanshangpin,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<ShoubanshangpinEntity> ew = new EntityWrapper<ShoubanshangpinEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = shoubanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubanshangpin), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShoubanshangpinEntity shoubanshangpin,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<ShoubanshangpinEntity> ew = new EntityWrapper<ShoubanshangpinEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = shoubanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubanshangpin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShoubanshangpinEntity shoubanshangpin){
       	EntityWrapper<ShoubanshangpinEntity> ew = new EntityWrapper<ShoubanshangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shoubanshangpin, "shoubanshangpin"));
        return R.ok().put("data", shoubanshangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShoubanshangpinEntity shoubanshangpin){
        EntityWrapper< ShoubanshangpinEntity> ew = new EntityWrapper< ShoubanshangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shoubanshangpin, "shoubanshangpin"));
		ShoubanshangpinView shoubanshangpinView =  shoubanshangpinService.selectView(ew);
		return R.ok("查询手办商品成功").put("data", shoubanshangpinView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShoubanshangpinEntity shoubanshangpin = shoubanshangpinService.selectById(id);
		shoubanshangpin.setClicktime(new Date());
		shoubanshangpinService.updateById(shoubanshangpin);
        shoubanshangpin = shoubanshangpinService.selectView(new EntityWrapper<ShoubanshangpinEntity>().eq("id", id));
        return R.ok().put("data", shoubanshangpin);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShoubanshangpinEntity shoubanshangpin = shoubanshangpinService.selectById(id);
		shoubanshangpin.setClicktime(new Date());
		shoubanshangpinService.updateById(shoubanshangpin);
        shoubanshangpin = shoubanshangpinService.selectView(new EntityWrapper<ShoubanshangpinEntity>().eq("id", id));
        return R.ok().put("data", shoubanshangpin);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShoubanshangpinEntity shoubanshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shoubanshangpin);
        shoubanshangpinService.insert(shoubanshangpin);
        return R.ok();
    }

    /**
     * 前台保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ShoubanshangpinEntity shoubanshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shoubanshangpin);
        shoubanshangpinService.insert(shoubanshangpin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShoubanshangpinEntity shoubanshangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shoubanshangpin);
        shoubanshangpinService.updateById(shoubanshangpin);//全部更新
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shoubanshangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShoubanshangpinEntity shoubanshangpin, HttpServletRequest request,String pre){
        EntityWrapper<ShoubanshangpinEntity> ew = new EntityWrapper<ShoubanshangpinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = shoubanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubanshangpin), params), params));
        return R.ok().put("data", page);
    }


        /**
     * 协同算法（按用户购买推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ShoubanshangpinEntity shoubanshangpin, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String goodtypeColumn = "shoubanfenlei";
        List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "shoubanshangpin").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ShoubanshangpinEntity> shoubanshangpinList = new ArrayList<ShoubanshangpinEntity>();
	//去重
    	List<OrdersEntity> ordersDist = new ArrayList<OrdersEntity>();
    	for(OrdersEntity o1 : orders) {
    		boolean addFlag = true;
    		for(OrdersEntity o2 : ordersDist) {
    			if(o1.getGoodid()==o2.getGoodid() || o1.getGoodtype().equals(o2.getGoodtype())) {
    				addFlag = false;
    				break;
    			}
    		}
    		if(addFlag) ordersDist.add(o1);
    	}
        if(ordersDist!=null && ordersDist.size()>0) {
                for(OrdersEntity o : ordersDist) {
                        shoubanshangpinList.addAll(shoubanshangpinService.selectList(new EntityWrapper<ShoubanshangpinEntity>().eq(goodtypeColumn, o.getGoodtype())));
                }
        }
        EntityWrapper<ShoubanshangpinEntity> ew = new EntityWrapper<ShoubanshangpinEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = shoubanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubanshangpin), params), params));
        List<ShoubanshangpinEntity> pageList = (List<ShoubanshangpinEntity>)page.getList();
        if(shoubanshangpinList.size()<limit) {
                int toAddNum = (limit-shoubanshangpinList.size())<=pageList.size()?(limit-shoubanshangpinList.size()):pageList.size();
                for(ShoubanshangpinEntity o1 : pageList) {
                    boolean addFlag = true;
                    for(ShoubanshangpinEntity o2 : shoubanshangpinList) {
                        if(o1.getId().intValue()==o2.getId().intValue()) {
                            addFlag = false;
                            break;
                        }
                    }
                    if(addFlag) {
                        shoubanshangpinList.add(o1);
                        if(--toAddNum==0) break;
                    }
                }
        } else if(shoubanshangpinList.size()>limit) {
            shoubanshangpinList = shoubanshangpinList.subList(0, limit);
        }
        page.setList(shoubanshangpinList);
        return R.ok().put("data", page);
    }








}
