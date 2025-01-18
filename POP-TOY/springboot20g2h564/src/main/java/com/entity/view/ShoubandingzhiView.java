package com.entity.view;

import com.entity.ShoubandingzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 手办定制
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
@TableName("shoubandingzhi")
public class ShoubandingzhiView  extends ShoubandingzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShoubandingzhiView(){
	}
 
 	public ShoubandingzhiView(ShoubandingzhiEntity shoubandingzhiEntity){
 	try {
			BeanUtils.copyProperties(this, shoubandingzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
