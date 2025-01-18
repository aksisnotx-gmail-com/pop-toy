package com.entity.model;

import com.entity.ShejituzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设计图纸
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public class ShejituzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 交付日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaofuriqi;
		
	/**
	 * 设计图纸
	 */
	
	private String shejituzhi;
		
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 手办详情
	 */
	
	private String shoubanxiangqing;
		
	/**
	 * 设计费用
	 */
	
	private Integer shejifeiyong;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
				
	
	/**
	 * 设置：交付日期
	 */
	 
	public void setJiaofuriqi(Date jiaofuriqi) {
		this.jiaofuriqi = jiaofuriqi;
	}
	
	/**
	 * 获取：交付日期
	 */
	public Date getJiaofuriqi() {
		return jiaofuriqi;
	}
				
	
	/**
	 * 设置：设计图纸
	 */
	 
	public void setShejituzhi(String shejituzhi) {
		this.shejituzhi = shejituzhi;
	}
	
	/**
	 * 获取：设计图纸
	 */
	public String getShejituzhi() {
		return shejituzhi;
	}
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：手办详情
	 */
	 
	public void setShoubanxiangqing(String shoubanxiangqing) {
		this.shoubanxiangqing = shoubanxiangqing;
	}
	
	/**
	 * 获取：手办详情
	 */
	public String getShoubanxiangqing() {
		return shoubanxiangqing;
	}
				
	
	/**
	 * 设置：设计费用
	 */
	 
	public void setShejifeiyong(Integer shejifeiyong) {
		this.shejifeiyong = shejifeiyong;
	}
	
	/**
	 * 获取：设计费用
	 */
	public Integer getShejifeiyong() {
		return shejifeiyong;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
