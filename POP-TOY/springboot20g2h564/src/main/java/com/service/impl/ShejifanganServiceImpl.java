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


import com.dao.ShejifanganDao;
import com.entity.ShejifanganEntity;
import com.service.ShejifanganService;
import com.entity.vo.ShejifanganVO;
import com.entity.view.ShejifanganView;

@Service("shejifanganService")
public class ShejifanganServiceImpl extends ServiceImpl<ShejifanganDao, ShejifanganEntity> implements ShejifanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShejifanganEntity> page = this.selectPage(
                new Query<ShejifanganEntity>(params).getPage(),
                new EntityWrapper<ShejifanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShejifanganEntity> wrapper) {
		  Page<ShejifanganView> page =new Query<ShejifanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShejifanganVO> selectListVO(Wrapper<ShejifanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShejifanganVO selectVO(Wrapper<ShejifanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShejifanganView> selectListView(Wrapper<ShejifanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShejifanganView selectView(Wrapper<ShejifanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
