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


import com.dao.ShejishiDao;
import com.entity.ShejishiEntity;
import com.service.ShejishiService;
import com.entity.vo.ShejishiVO;
import com.entity.view.ShejishiView;

@Service("shejishiService")
public class ShejishiServiceImpl extends ServiceImpl<ShejishiDao, ShejishiEntity> implements ShejishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShejishiEntity> page = this.selectPage(
                new Query<ShejishiEntity>(params).getPage(),
                new EntityWrapper<ShejishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShejishiEntity> wrapper) {
		  Page<ShejishiView> page =new Query<ShejishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShejishiVO> selectListVO(Wrapper<ShejishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShejishiVO selectVO(Wrapper<ShejishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShejishiView> selectListView(Wrapper<ShejishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShejishiView selectView(Wrapper<ShejishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
