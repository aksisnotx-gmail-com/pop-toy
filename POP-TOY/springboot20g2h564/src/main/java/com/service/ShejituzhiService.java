package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShejituzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShejituzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShejituzhiView;


/**
 * 设计图纸
 *
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShejituzhiService extends IService<ShejituzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShejituzhiVO> selectListVO(Wrapper<ShejituzhiEntity> wrapper);
   	
   	ShejituzhiVO selectVO(@Param("ew") Wrapper<ShejituzhiEntity> wrapper);
   	
   	List<ShejituzhiView> selectListView(Wrapper<ShejituzhiEntity> wrapper);
   	
   	ShejituzhiView selectView(@Param("ew") Wrapper<ShejituzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShejituzhiEntity> wrapper);

   	

}

