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


import com.dao.ShoubanshangpinDao;
import com.entity.ShoubanshangpinEntity;
import com.service.ShoubanshangpinService;
import com.entity.vo.ShoubanshangpinVO;
import com.entity.view.ShoubanshangpinView;

@Service("shoubanshangpinService")
public class ShoubanshangpinServiceImpl extends ServiceImpl<ShoubanshangpinDao, ShoubanshangpinEntity> implements ShoubanshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoubanshangpinEntity> page = this.selectPage(
                new Query<ShoubanshangpinEntity>(params).getPage(),
                new EntityWrapper<ShoubanshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoubanshangpinEntity> wrapper) {
		  Page<ShoubanshangpinView> page =new Query<ShoubanshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShoubanshangpinVO> selectListVO(Wrapper<ShoubanshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoubanshangpinVO selectVO(Wrapper<ShoubanshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoubanshangpinView> selectListView(Wrapper<ShoubanshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoubanshangpinView selectView(Wrapper<ShoubanshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
