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

import com.entity.ShoubandingzhiEntity;
import com.entity.view.ShoubandingzhiView;

import com.service.ShoubandingzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 手办定制
 * 后端接口
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
@RestController
@RequestMapping("/shoubandingzhi")
public class ShoubandingzhiController {
    @Autowired
    private ShoubandingzhiService shoubandingzhiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShoubandingzhiEntity shoubandingzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shejishi")) {
			shoubandingzhi.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			shoubandingzhi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShoubandingzhiEntity> ew = new EntityWrapper<ShoubandingzhiEntity>();

		PageUtils page = shoubandingzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubandingzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShoubandingzhiEntity shoubandingzhi, 
		HttpServletRequest request){
        EntityWrapper<ShoubandingzhiEntity> ew = new EntityWrapper<ShoubandingzhiEntity>();

		PageUtils page = shoubandingzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubandingzhi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShoubandingzhiEntity shoubandingzhi){
       	EntityWrapper<ShoubandingzhiEntity> ew = new EntityWrapper<ShoubandingzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shoubandingzhi, "shoubandingzhi")); 
        return R.ok().put("data", shoubandingzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShoubandingzhiEntity shoubandingzhi){
        EntityWrapper< ShoubandingzhiEntity> ew = new EntityWrapper< ShoubandingzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shoubandingzhi, "shoubandingzhi")); 
		ShoubandingzhiView shoubandingzhiView =  shoubandingzhiService.selectView(ew);
		return R.ok("查询手办定制成功").put("data", shoubandingzhiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShoubandingzhiEntity shoubandingzhi = shoubandingzhiService.selectById(id);
        return R.ok().put("data", shoubandingzhi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShoubandingzhiEntity shoubandingzhi = shoubandingzhiService.selectById(id);
        return R.ok().put("data", shoubandingzhi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShoubandingzhiEntity shoubandingzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shoubandingzhi);
        shoubandingzhiService.insert(shoubandingzhi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ShoubandingzhiEntity shoubandingzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shoubandingzhi);
        shoubandingzhiService.insert(shoubandingzhi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShoubandingzhiEntity shoubandingzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shoubandingzhi);
        shoubandingzhiService.updateById(shoubandingzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shoubandingzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
