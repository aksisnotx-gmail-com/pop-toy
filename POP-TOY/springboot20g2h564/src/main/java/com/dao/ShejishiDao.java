package com.dao;

import com.entity.ShejishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShejishiVO;
import com.entity.view.ShejishiView;


/**
 * 设计师
 * 
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShejishiDao extends BaseMapper<ShejishiEntity> {
	
	List<ShejishiVO> selectListVO(@Param("ew") Wrapper<ShejishiEntity> wrapper);
	
	ShejishiVO selectVO(@Param("ew") Wrapper<ShejishiEntity> wrapper);
	
	List<ShejishiView> selectListView(@Param("ew") Wrapper<ShejishiEntity> wrapper);

	List<ShejishiView> selectListView(Pagination page,@Param("ew") Wrapper<ShejishiEntity> wrapper);

	
	ShejishiView selectView(@Param("ew") Wrapper<ShejishiEntity> wrapper);
	

}
