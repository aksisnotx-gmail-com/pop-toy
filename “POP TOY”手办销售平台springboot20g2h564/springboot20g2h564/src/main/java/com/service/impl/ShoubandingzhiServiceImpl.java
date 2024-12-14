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


import com.dao.ShoubandingzhiDao;
import com.entity.ShoubandingzhiEntity;
import com.service.ShoubandingzhiService;
import com.entity.vo.ShoubandingzhiVO;
import com.entity.view.ShoubandingzhiView;

@Service("shoubandingzhiService")
public class ShoubandingzhiServiceImpl extends ServiceImpl<ShoubandingzhiDao, ShoubandingzhiEntity> implements ShoubandingzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoubandingzhiEntity> page = this.selectPage(
                new Query<ShoubandingzhiEntity>(params).getPage(),
                new EntityWrapper<ShoubandingzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoubandingzhiEntity> wrapper) {
		  Page<ShoubandingzhiView> page =new Query<ShoubandingzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShoubandingzhiVO> selectListVO(Wrapper<ShoubandingzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoubandingzhiVO selectVO(Wrapper<ShoubandingzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoubandingzhiView> selectListView(Wrapper<ShoubandingzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoubandingzhiView selectView(Wrapper<ShoubandingzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
