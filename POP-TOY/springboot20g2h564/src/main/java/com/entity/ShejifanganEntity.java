package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 设计方案
 * 数据库通用操作实体类（普通增删改查）
 * @author
 * @email
 * @date 2050-04-27 11:01:35
 */
@TableName("shejifangan")
public class ShejifanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShejifanganEntity() {

	}

	public ShejifanganEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 工号
	 */

	private String gonghao;

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
	 * 设计日期
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
	private Date shejiriqi;

	/**
	 * 图片
	 */

	private String tupian;

	/**
	 * 标题
	 */

	private String biaoti;

	/**
	 * 设计方案
	 */

	private String shejifangan;

	/**
	 * 材质
	 */

	private String caizhi;

	/**
	 * 工艺建议
	 */

	private String gongyijianyi;

	/**
	 * 回复内容
	 */

	private String shhf;


	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：设计日期
	 */
	public void setShejiriqi(Date shejiriqi) {
		this.shejiriqi = shejiriqi;
	}
	/**
	 * 获取：设计日期
	 */
	public Date getShejiriqi() {
		return shejiriqi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：设计方案
	 */
	public void setShejifangan(String shejifangan) {
		this.shejifangan = shejifangan;
	}
	/**
	 * 获取：设计方案
	 */
	public String getShejifangan() {
		return shejifangan;
	}
	/**
	 * 设置：材质
	 */
	public void setCaizhi(String caizhi) {
		this.caizhi = caizhi;
	}
	/**
	 * 获取：材质
	 */
	public String getCaizhi() {
		return caizhi;
	}
	/**
	 * 设置：工艺建议
	 */
	public void setGongyijianyi(String gongyijianyi) {
		this.gongyijianyi = gongyijianyi;
	}
	/**
	 * 获取：工艺建议
	 */
	public String getGongyijianyi() {
		return gongyijianyi;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}

}
