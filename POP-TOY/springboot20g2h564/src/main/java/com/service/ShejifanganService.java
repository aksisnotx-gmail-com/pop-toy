package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShejifanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShejifanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShejifanganView;


/**
 * 设计方案
 *
 * @author 
 * @email 
 * @date 2050-04-27 11:01:35
 */
public interface ShejifanganService extends IService<ShejifanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShejifanganVO> selectListVO(Wrapper<ShejifanganEntity> wrapper);
   	
   	ShejifanganVO selectVO(@Param("ew") Wrapper<ShejifanganEntity> wrapper);
   	
   	List<ShejifanganView> selectListView(Wrapper<ShejifanganEntity> wrapper);
   	
   	ShejifanganView selectView(@Param("ew") Wrapper<ShejifanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShejifanganEntity> wrapper);

   	

}

