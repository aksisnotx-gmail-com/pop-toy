package com.dao;

import com.entity.ShejifanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShejifanganVO;
import com.entity.view.ShejifanganView;


/**
 * 设计方案
 *
 * @author
 * @email
 * @date 2050-04-27 11:01:35
 */
public interface ShejifanganDao extends BaseMapper<ShejifanganEntity> {

	List<ShejifanganVO> selectListVO(@Param("ew") Wrapper<ShejifanganEntity> wrapper);

	ShejifanganVO selectVO(@Param("ew") Wrapper<ShejifanganEntity> wrapper);

	List<ShejifanganView> selectListView(@Param("ew") Wrapper<ShejifanganEntity> wrapper);

	List<ShejifanganView> selectListView(Pagination page,@Param("ew") Wrapper<ShejifanganEntity> wrapper);


	ShejifanganView selectView(@Param("ew") Wrapper<ShejifanganEntity> wrapper);


}
