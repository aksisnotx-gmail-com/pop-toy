package com.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.convert.Convert;
import com.entity.vo.DiscussProductVO;
import com.service.ShoubanshangpinService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

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
@RequiredArgsConstructor
public class DiscussshoubanshangpinServiceImpl extends ServiceImpl<DiscussshoubanshangpinDao, DiscussshoubanshangpinEntity> implements DiscussshoubanshangpinService {

	private final ShoubanshangpinService shoubanshangpinService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshoubanshangpinEntity> page = this.selectPage(
                new Query<DiscussshoubanshangpinEntity>(params).getPage(),
                new EntityWrapper<>());

		Page<DiscussProductVO> productVOPage = new Page<>();
		List<DiscussProductVO> collect = page.getRecords().stream().map(t -> {
			DiscussProductVO convert = Convert.convert(DiscussProductVO.class, t);
			convert.setProductInfo(shoubanshangpinService.selectById(t.getRefid()));
			return convert;
		}).collect(Collectors.toList());
		BeanUtil.copyProperties(page,productVOPage);
		productVOPage.setRecords(collect);
		return new PageUtils(productVOPage);
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
