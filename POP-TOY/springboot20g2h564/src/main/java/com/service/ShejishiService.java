package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShejishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShejishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShejishiView;


/**
 * 设计师
 *
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShejishiService extends IService<ShejishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShejishiVO> selectListVO(Wrapper<ShejishiEntity> wrapper);
   	
   	ShejishiVO selectVO(@Param("ew") Wrapper<ShejishiEntity> wrapper);
   	
   	List<ShejishiView> selectListView(Wrapper<ShejishiEntity> wrapper);
   	
   	ShejishiView selectView(@Param("ew") Wrapper<ShejishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShejishiEntity> wrapper);

   	

}

