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


import com.dao.ShoubanfenleiDao;
import com.entity.ShoubanfenleiEntity;
import com.service.ShoubanfenleiService;
import com.entity.vo.ShoubanfenleiVO;
import com.entity.view.ShoubanfenleiView;

@Service("shoubanfenleiService")
public class ShoubanfenleiServiceImpl extends ServiceImpl<ShoubanfenleiDao, ShoubanfenleiEntity> implements ShoubanfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoubanfenleiEntity> page = this.selectPage(
                new Query<ShoubanfenleiEntity>(params).getPage(),
                new EntityWrapper<ShoubanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoubanfenleiEntity> wrapper) {
		  Page<ShoubanfenleiView> page =new Query<ShoubanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShoubanfenleiVO> selectListVO(Wrapper<ShoubanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoubanfenleiVO selectVO(Wrapper<ShoubanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoubanfenleiView> selectListView(Wrapper<ShoubanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoubanfenleiView selectView(Wrapper<ShoubanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
