package com.dao;

import com.entity.ShejituzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShejituzhiVO;
import com.entity.view.ShejituzhiView;


/**
 * 设计图纸
 * 
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShejituzhiDao extends BaseMapper<ShejituzhiEntity> {
	
	List<ShejituzhiVO> selectListVO(@Param("ew") Wrapper<ShejituzhiEntity> wrapper);
	
	ShejituzhiVO selectVO(@Param("ew") Wrapper<ShejituzhiEntity> wrapper);
	
	List<ShejituzhiView> selectListView(@Param("ew") Wrapper<ShejituzhiEntity> wrapper);

	List<ShejituzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ShejituzhiEntity> wrapper);

	
	ShejituzhiView selectView(@Param("ew") Wrapper<ShejituzhiEntity> wrapper);
	

}
