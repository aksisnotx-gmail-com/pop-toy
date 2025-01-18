package com.dao;

import com.entity.ShoubandingzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoubandingzhiVO;
import com.entity.view.ShoubandingzhiView;


/**
 * 手办定制
 * 
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShoubandingzhiDao extends BaseMapper<ShoubandingzhiEntity> {
	
	List<ShoubandingzhiVO> selectListVO(@Param("ew") Wrapper<ShoubandingzhiEntity> wrapper);
	
	ShoubandingzhiVO selectVO(@Param("ew") Wrapper<ShoubandingzhiEntity> wrapper);
	
	List<ShoubandingzhiView> selectListView(@Param("ew") Wrapper<ShoubandingzhiEntity> wrapper);

	List<ShoubandingzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoubandingzhiEntity> wrapper);

	
	ShoubandingzhiView selectView(@Param("ew") Wrapper<ShoubandingzhiEntity> wrapper);
	

}
