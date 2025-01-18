package com.entity.view;

import com.entity.ShejifanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 设计方案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
@TableName("shejifangan")
public class ShejifanganView  extends ShejifanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShejifanganView(){
	}
 
 	public ShejifanganView(ShejifanganEntity shejifanganEntity){
 	try {
			BeanUtils.copyProperties(this, shejifanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
