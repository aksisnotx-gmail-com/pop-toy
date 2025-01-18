package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShejituzhiDao;
import com.entity.ShejituzhiEntity;
import com.service.ShejituzhiService;
import com.entity.vo.ShejituzhiVO;
import com.entity.view.ShejituzhiView;

@Service("shejituzhiService")
public class ShejituzhiServiceImpl extends ServiceImpl<ShejituzhiDao, ShejituzhiEntity> implements ShejituzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShejituzhiEntity> page = this.selectPage(
                new Query<ShejituzhiEntity>(params).getPage(),
                new EntityWrapper<ShejituzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShejituzhiEntity> wrapper) {
		  Page<ShejituzhiView> page =new Query<ShejituzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShejituzhiVO> selectListVO(Wrapper<ShejituzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShejituzhiVO selectVO(Wrapper<ShejituzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShejituzhiView> selectListView(Wrapper<ShejituzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShejituzhiView selectView(Wrapper<ShejituzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
