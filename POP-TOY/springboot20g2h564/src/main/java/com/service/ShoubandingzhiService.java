package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoubandingzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoubandingzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoubandingzhiView;


/**
 * 手办定制
 *
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShoubandingzhiService extends IService<ShoubandingzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoubandingzhiVO> selectListVO(Wrapper<ShoubandingzhiEntity> wrapper);
   	
   	ShoubandingzhiVO selectVO(@Param("ew") Wrapper<ShoubandingzhiEntity> wrapper);
   	
   	List<ShoubandingzhiView> selectListView(Wrapper<ShoubandingzhiEntity> wrapper);
   	
   	ShoubandingzhiView selectView(@Param("ew") Wrapper<ShoubandingzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoubandingzhiEntity> wrapper);

   	

}

