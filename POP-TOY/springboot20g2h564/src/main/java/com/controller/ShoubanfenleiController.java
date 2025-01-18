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

import com.entity.ShoubanfenleiEntity;
import com.entity.view.ShoubanfenleiView;

import com.service.ShoubanfenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 手办分类
 * 后端接口
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
@RestController
@RequestMapping("/shoubanfenlei")
public class ShoubanfenleiController {
    @Autowired
    private ShoubanfenleiService shoubanfenleiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShoubanfenleiEntity shoubanfenlei,
		HttpServletRequest request){
        EntityWrapper<ShoubanfenleiEntity> ew = new EntityWrapper<ShoubanfenleiEntity>();

		PageUtils page = shoubanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubanfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShoubanfenleiEntity shoubanfenlei, 
		HttpServletRequest request){
        EntityWrapper<ShoubanfenleiEntity> ew = new EntityWrapper<ShoubanfenleiEntity>();

		PageUtils page = shoubanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoubanfenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShoubanfenleiEntity shoubanfenlei){
       	EntityWrapper<ShoubanfenleiEntity> ew = new EntityWrapper<ShoubanfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shoubanfenlei, "shoubanfenlei")); 
        return R.ok().put("data", shoubanfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShoubanfenleiEntity shoubanfenlei){
        EntityWrapper< ShoubanfenleiEntity> ew = new EntityWrapper< ShoubanfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shoubanfenlei, "shoubanfenlei")); 
		ShoubanfenleiView shoubanfenleiView =  shoubanfenleiService.selectView(ew);
		return R.ok("查询手办分类成功").put("data", shoubanfenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShoubanfenleiEntity shoubanfenlei = shoubanfenleiService.selectById(id);
        return R.ok().put("data", shoubanfenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShoubanfenleiEntity shoubanfenlei = shoubanfenleiService.selectById(id);
        return R.ok().put("data", shoubanfenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShoubanfenleiEntity shoubanfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shoubanfenlei);
        shoubanfenleiService.insert(shoubanfenlei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShoubanfenleiEntity shoubanfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shoubanfenlei);
        shoubanfenleiService.insert(shoubanfenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShoubanfenleiEntity shoubanfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shoubanfenlei);
        shoubanfenleiService.updateById(shoubanfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shoubanfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
