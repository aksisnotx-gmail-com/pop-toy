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
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussshoubanshangpinEntity;
import com.entity.view.DiscussshoubanshangpinView;

import com.service.DiscussshoubanshangpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 手办商品评论表
 * 后端接口
 * @author
 * @email
 * @date 2050-04-27 11:01:36
 */
@RestController
@RequestMapping("/discussshoubanshangpin")
public class DiscussshoubanshangpinController {
    @Autowired
    private DiscussshoubanshangpinService discussshoubanshangpinService;


    /**
     * admin query comment list
     */
    @PostMapping("admin/list")
    public R adminQueryCommentsByPage(@RequestBody Map<String, Object> params) {
        return R.ok().put("data",discussshoubanshangpinService.queryPage(params));
    }

    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussshoubanshangpinEntity discussshoubanshangpin,
		HttpServletRequest request){
        EntityWrapper<DiscussshoubanshangpinEntity> ew = new EntityWrapper<DiscussshoubanshangpinEntity>();

		PageUtils page = discussshoubanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshoubanshangpin), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussshoubanshangpinEntity discussshoubanshangpin,
		HttpServletRequest request){
        EntityWrapper<DiscussshoubanshangpinEntity> ew = new EntityWrapper<DiscussshoubanshangpinEntity>();

		PageUtils page = discussshoubanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshoubanshangpin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussshoubanshangpinEntity discussshoubanshangpin){
       	EntityWrapper<DiscussshoubanshangpinEntity> ew = new EntityWrapper<DiscussshoubanshangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussshoubanshangpin, "discussshoubanshangpin"));
        return R.ok().put("data", discussshoubanshangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussshoubanshangpinEntity discussshoubanshangpin){
        EntityWrapper< DiscussshoubanshangpinEntity> ew = new EntityWrapper< DiscussshoubanshangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussshoubanshangpin, "discussshoubanshangpin"));
		DiscussshoubanshangpinView discussshoubanshangpinView =  discussshoubanshangpinService.selectView(ew);
		return R.ok("查询手办商品评论表成功").put("data", discussshoubanshangpinView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussshoubanshangpinEntity discussshoubanshangpin = discussshoubanshangpinService.selectById(id);
        return R.ok().put("data", discussshoubanshangpin);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussshoubanshangpinEntity discussshoubanshangpin = discussshoubanshangpinService.selectById(id);
        return R.ok().put("data", discussshoubanshangpin);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussshoubanshangpinEntity discussshoubanshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussshoubanshangpin);
        discussshoubanshangpinService.insert(discussshoubanshangpin);
        return R.ok();
    }

    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussshoubanshangpinEntity discussshoubanshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussshoubanshangpin);
        discussshoubanshangpinService.insert(discussshoubanshangpin);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscussshoubanshangpinEntity discussshoubanshangpin = discussshoubanshangpinService.selectOne(new EntityWrapper<DiscussshoubanshangpinEntity>().eq("", username));
        return R.ok().put("data", discussshoubanshangpin);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussshoubanshangpinEntity discussshoubanshangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshoubanshangpin);
        discussshoubanshangpinService.updateById(discussshoubanshangpin);//全部更新
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussshoubanshangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussshoubanshangpinEntity discussshoubanshangpin, HttpServletRequest request,String pre){
        EntityWrapper<DiscussshoubanshangpinEntity> ew = new EntityWrapper<DiscussshoubanshangpinEntity>();
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
		PageUtils page = discussshoubanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshoubanshangpin), params), params));
        return R.ok().put("data", page);
    }










}
