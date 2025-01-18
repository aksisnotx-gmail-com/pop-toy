package com.dao;

import com.entity.DiscussshoubanshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshoubanshangpinVO;
import com.entity.view.DiscussshoubanshangpinView;


/**
 * 手办商品评论表
 * 
 * @author 
 * @email 
 * @date 2050-04-27 11:01:36
 */
public interface DiscussshoubanshangpinDao extends BaseMapper<DiscussshoubanshangpinEntity> {
	
	List<DiscussshoubanshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussshoubanshangpinEntity> wrapper);
	
	DiscussshoubanshangpinVO selectVO(@Param("ew") Wrapper<DiscussshoubanshangpinEntity> wrapper);
	
	List<DiscussshoubanshangpinView> selectListView(@Param("ew") Wrapper<DiscussshoubanshangpinEntity> wrapper);

	List<DiscussshoubanshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshoubanshangpinEntity> wrapper);

	
	DiscussshoubanshangpinView selectView(@Param("ew") Wrapper<DiscussshoubanshangpinEntity> wrapper);
	

}
