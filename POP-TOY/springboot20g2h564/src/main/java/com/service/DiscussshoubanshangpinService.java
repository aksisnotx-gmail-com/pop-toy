package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshoubanshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshoubanshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshoubanshangpinView;


/**
 * 手办商品评论表
 *
 * @author
 * @email
 * @date 2050-04-27 11:01:36
 */
public interface DiscussshoubanshangpinService extends IService<DiscussshoubanshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<DiscussshoubanshangpinVO> selectListVO(Wrapper<DiscussshoubanshangpinEntity> wrapper);

   	DiscussshoubanshangpinVO selectVO(@Param("ew") Wrapper<DiscussshoubanshangpinEntity> wrapper);

   	List<DiscussshoubanshangpinView> selectListView(Wrapper<DiscussshoubanshangpinEntity> wrapper);

   	DiscussshoubanshangpinView selectView(@Param("ew") Wrapper<DiscussshoubanshangpinEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshoubanshangpinEntity> wrapper);



}

