package com.service.impl;

import com.entity.ShejifanganEntity;
import com.service.ShejifanganService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

import javax.annotation.Resource;

@Service("shoubandingzhiService")
@RequiredArgsConstructor
public class ShoubandingzhiServiceImpl extends ServiceImpl<ShoubandingzhiDao, ShoubandingzhiEntity> implements ShoubandingzhiService {

	private final ShejifanganService shejifanganService;
	
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
		Page<ShoubandingzhiView> page = new Query<ShoubandingzhiView>(params).getPage();
		page.setRecords(baseMapper.selectListView(page, wrapper));

		Object material = params.get("material");
		Object crafts = params.get("crafts");
		if (Objects.nonNull(material) || Objects.nonNull(crafts)) {
			List<ShoubandingzhiView> collect = page.getRecords().stream().
					filter(t -> {
						List<ShejifanganEntity> ls = shejifanganService.selectList(new EntityWrapper<ShejifanganEntity>().eq("gonghao", t.getGonghao()));

                        if (ls.isEmpty()) {
							return false;
                        }

                        if (Objects.nonNull(material) && Objects.nonNull(crafts)) {
                            return ls.stream().anyMatch(t1 -> Objects.equals(t1.getCaizhi(),material) &&
									Objects.equals(t1.getGongyijianyi(),crafts));
                        }

						if (Objects.nonNull(material)) {
							return ls.stream().anyMatch(t1 -> Objects.equals(t1.getCaizhi(),material));
						}

						if (Objects.nonNull(crafts)) {
							return ls.stream().anyMatch(t1 -> Objects.equals(t1.getGongyijianyi(),crafts));
						}

						return true;
					}).
					collect(Collectors.toList());

			page.setRecords(collect);
			page.setTotal(collect.size());
		}
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
