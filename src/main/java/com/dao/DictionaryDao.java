package com.dao;

import com.entity.DictionaryEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DictionaryView;

/**
 * 用品分类 Dao 接口
 *
 * @author 
 * @since 2021-03-23
 */
public interface DictionaryDao extends BaseMapper<DictionaryEntity> {

   List<DictionaryView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
