package com.entity.model;

import com.entity.ShoubandingzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 手办定制
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public class ShoubandingzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 定制需求
	 */
	
	private String dingzhixuqiu;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 定制日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dingzhiriqi;
		
	/**
	 * 样式图片
	 */
	
	private String yangshitupian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：定制需求
	 */
	 
	public void setDingzhixuqiu(String dingzhixuqiu) {
		this.dingzhixuqiu = dingzhixuqiu;
	}
	
	/**
	 * 获取：定制需求
	 */
	public String getDingzhixuqiu() {
		return dingzhixuqiu;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：定制日期
	 */
	 
	public void setDingzhiriqi(Date dingzhiriqi) {
		this.dingzhiriqi = dingzhiriqi;
	}
	
	/**
	 * 获取：定制日期
	 */
	public Date getDingzhiriqi() {
		return dingzhiriqi;
	}
				
	
	/**
	 * 设置：样式图片
	 */
	 
	public void setYangshitupian(String yangshitupian) {
		this.yangshitupian = yangshitupian;
	}
	
	/**
	 * 获取：样式图片
	 */
	public String getYangshitupian() {
		return yangshitupian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
			
}
