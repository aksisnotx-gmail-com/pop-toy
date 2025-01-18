package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import com.entity.ShejifanganEntity;
import com.entity.ShoubandingzhiEntity;
import com.service.*;
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

import com.entity.ShejishiEntity;
import com.entity.view.ShejishiView;

import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

import com.entity.StoreupEntity;

/**
 * 设计师
 * 后端接口
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
@RestController
@RequestMapping("/shejishi")
public class ShejishiController {
    @Autowired
    private ShejishiService shejishiService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private ShejifanganService shejifanganService;

    @Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ShejishiEntity u = shejishiService.selectOne(new EntityWrapper<ShejishiEntity>().eq("gonghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"shejishi",  "管理员" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody ShejishiEntity shejishi){
    	//ValidatorUtils.validateEntity(shejishi);
    	ShejishiEntity u = shejishiService.selectOne(new EntityWrapper<ShejishiEntity>().eq("gonghao", shejishi.getGonghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		shejishi.setId(uId);
        shejishiService.insert(shejishi);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ShejishiEntity u = shejishiService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ShejishiEntity u = shejishiService.selectOne(new EntityWrapper<ShejishiEntity>().eq("gonghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        shejishiService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShejishiEntity shejishi,
		HttpServletRequest request){
        EntityWrapper<ShejishiEntity> ew = new EntityWrapper<ShejishiEntity>();

		PageUtils page = shejishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shejishi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShejishiEntity shejishi, 
		HttpServletRequest request){
        EntityWrapper<ShejishiEntity> ew = new EntityWrapper<ShejishiEntity>();

		PageUtils page = shejishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shejishi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShejishiEntity shejishi){
       	EntityWrapper<ShejishiEntity> ew = new EntityWrapper<ShejishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shejishi, "shejishi")); 
        return R.ok().put("data", shejishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShejishiEntity shejishi){
        EntityWrapper< ShejishiEntity> ew = new EntityWrapper< ShejishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shejishi, "shejishi")); 
		ShejishiView shejishiView =  shejishiService.selectView(ew);
		return R.ok("查询设计师成功").put("data", shejishiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShejishiEntity shejishi = shejishiService.selectById(id);
        return R.ok().put("data", shejishi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShejishiEntity shejishi = shejishiService.selectById(id);
        if (Objects.nonNull(shejishi)) {
            List<ShejifanganEntity> gonghao = shejifanganService.selectList(new EntityWrapper<ShejifanganEntity>().eq("gonghao", shejishi.getGonghao()));
            return R.ok().put("data",shejishi).put("design",gonghao.isEmpty() ? new ShejifanganEntity() : gonghao.get(0));
        }
        return R.ok().put("data", shejishi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ShejishiEntity shejishi = shejishiService.selectById(id);
        if(type.equals("1")) {
        	shejishi.setThumbsupnum(shejishi.getThumbsupnum()+1);
        } else {
        	shejishi.setCrazilynum(shejishi.getCrazilynum()+1);
        }
        shejishiService.updateById(shejishi);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShejishiEntity shejishi, HttpServletRequest request){
        if(shejishiService.selectCount(new EntityWrapper<ShejishiEntity>().eq("gonghao", shejishi.getGonghao()))>0) {
            return R.error("工号已存在");
        }
    	shejishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shejishi);
    	ShejishiEntity u = shejishiService.selectOne(new EntityWrapper<ShejishiEntity>().eq("gonghao", shejishi.getGonghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		shejishi.setId(new Date().getTime());
        shejishiService.insert(shejishi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShejishiEntity shejishi, HttpServletRequest request){
        if(shejishiService.selectCount(new EntityWrapper<ShejishiEntity>().eq("gonghao", shejishi.getGonghao()))>0) {
            return R.error("工号已存在");
        }
    	shejishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shejishi);
    	ShejishiEntity u = shejishiService.selectOne(new EntityWrapper<ShejishiEntity>().eq("gonghao", shejishi.getGonghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		shejishi.setId(new Date().getTime());
        shejishiService.insert(shejishi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShejishiEntity shejishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shejishi);
        if(shejishiService.selectCount(new EntityWrapper<ShejishiEntity>().ne("id", shejishi.getId()).eq("gonghao", shejishi.getGonghao()))>0) {
            return R.error("工号已存在");
        }
        shejishiService.updateById(shejishi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shejishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
