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


import com.dao.DiscussshoubanshangpinDao;
import com.entity.DiscussshoubanshangpinEntity;
import com.service.DiscussshoubanshangpinService;
import com.entity.vo.DiscussshoubanshangpinVO;
import com.entity.view.DiscussshoubanshangpinView;

@Service("discussshoubanshangpinService")
public class DiscussshoubanshangpinServiceImpl extends ServiceImpl<DiscussshoubanshangpinDao, DiscussshoubanshangpinEntity> implements DiscussshoubanshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshoubanshangpinEntity> page = this.selectPage(
                new Query<DiscussshoubanshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussshoubanshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshoubanshangpinEntity> wrapper) {
		  Page<DiscussshoubanshangpinView> page =new Query<DiscussshoubanshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussshoubanshangpinVO> selectListVO(Wrapper<DiscussshoubanshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshoubanshangpinVO selectVO(Wrapper<DiscussshoubanshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshoubanshangpinView> selectListView(Wrapper<DiscussshoubanshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshoubanshangpinView selectView(Wrapper<DiscussshoubanshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
