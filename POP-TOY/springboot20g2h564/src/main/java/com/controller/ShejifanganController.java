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

import com.entity.ShejifanganEntity;
import com.entity.view.ShejifanganView;

import com.service.ShejifanganService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 设计方案
 * 后端接口
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
@RestController
@RequestMapping("/shejifangan")
public class ShejifanganController {
    @Autowired
    private ShejifanganService shejifanganService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShejifanganEntity shejifangan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shejishi")) {
			shejifangan.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			shejifangan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShejifanganEntity> ew = new EntityWrapper<ShejifanganEntity>();

		PageUtils page = shejifanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shejifangan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShejifanganEntity shejifangan, 
		HttpServletRequest request){
        EntityWrapper<ShejifanganEntity> ew = new EntityWrapper<ShejifanganEntity>();

		PageUtils page = shejifanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shejifangan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShejifanganEntity shejifangan){
       	EntityWrapper<ShejifanganEntity> ew = new EntityWrapper<ShejifanganEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shejifangan, "shejifangan")); 
        return R.ok().put("data", shejifanganService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShejifanganEntity shejifangan){
        EntityWrapper< ShejifanganEntity> ew = new EntityWrapper< ShejifanganEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shejifangan, "shejifangan")); 
		ShejifanganView shejifanganView =  shejifanganService.selectView(ew);
		return R.ok("查询设计方案成功").put("data", shejifanganView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShejifanganEntity shejifangan = shejifanganService.selectById(id);
        return R.ok().put("data", shejifangan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShejifanganEntity shejifangan = shejifanganService.selectById(id);
        return R.ok().put("data", shejifangan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShejifanganEntity shejifangan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shejifangan);
        shejifanganService.insert(shejifangan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ShejifanganEntity shejifangan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shejifangan);
        shejifanganService.insert(shejifangan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShejifanganEntity shejifangan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shejifangan);
        shejifanganService.updateById(shejifangan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shejifanganService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
