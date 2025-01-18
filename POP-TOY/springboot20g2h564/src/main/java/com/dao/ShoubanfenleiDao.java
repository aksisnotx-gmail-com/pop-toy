package com.dao;

import com.entity.ShoubanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoubanfenleiVO;
import com.entity.view.ShoubanfenleiView;


/**
 * 手办分类
 * 
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShoubanfenleiDao extends BaseMapper<ShoubanfenleiEntity> {
	
	List<ShoubanfenleiVO> selectListVO(@Param("ew") Wrapper<ShoubanfenleiEntity> wrapper);
	
	ShoubanfenleiVO selectVO(@Param("ew") Wrapper<ShoubanfenleiEntity> wrapper);
	
	List<ShoubanfenleiView> selectListView(@Param("ew") Wrapper<ShoubanfenleiEntity> wrapper);

	List<ShoubanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoubanfenleiEntity> wrapper);

	
	ShoubanfenleiView selectView(@Param("ew") Wrapper<ShoubanfenleiEntity> wrapper);
	

}
