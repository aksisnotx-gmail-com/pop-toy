package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoubanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoubanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoubanfenleiView;


/**
 * 手办分类
 *
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShoubanfenleiService extends IService<ShoubanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoubanfenleiVO> selectListVO(Wrapper<ShoubanfenleiEntity> wrapper);
   	
   	ShoubanfenleiVO selectVO(@Param("ew") Wrapper<ShoubanfenleiEntity> wrapper);
   	
   	List<ShoubanfenleiView> selectListView(Wrapper<ShoubanfenleiEntity> wrapper);
   	
   	ShoubanfenleiView selectView(@Param("ew") Wrapper<ShoubanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoubanfenleiEntity> wrapper);

   	

}

