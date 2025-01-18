package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoubanshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoubanshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoubanshangpinView;


/**
 * 手办商品
 *
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShoubanshangpinService extends IService<ShoubanshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoubanshangpinVO> selectListVO(Wrapper<ShoubanshangpinEntity> wrapper);
   	
   	ShoubanshangpinVO selectVO(@Param("ew") Wrapper<ShoubanshangpinEntity> wrapper);
   	
   	List<ShoubanshangpinView> selectListView(Wrapper<ShoubanshangpinEntity> wrapper);
   	
   	ShoubanshangpinView selectView(@Param("ew") Wrapper<ShoubanshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoubanshangpinEntity> wrapper);

   	

}

