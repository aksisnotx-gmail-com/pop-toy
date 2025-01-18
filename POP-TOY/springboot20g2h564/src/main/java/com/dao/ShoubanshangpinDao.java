package com.dao;

import com.entity.ShoubanshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoubanshangpinVO;
import com.entity.view.ShoubanshangpinView;


/**
 * 手办商品
 * 
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShoubanshangpinDao extends BaseMapper<ShoubanshangpinEntity> {
	
	List<ShoubanshangpinVO> selectListVO(@Param("ew") Wrapper<ShoubanshangpinEntity> wrapper);
	
	ShoubanshangpinVO selectVO(@Param("ew") Wrapper<ShoubanshangpinEntity> wrapper);
	
	List<ShoubanshangpinView> selectListView(@Param("ew") Wrapper<ShoubanshangpinEntity> wrapper);

	List<ShoubanshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<ShoubanshangpinEntity> wrapper);

	
	ShoubanshangpinView selectView(@Param("ew") Wrapper<ShoubanshangpinEntity> wrapper);
	

}
