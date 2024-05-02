package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DictionaryEntity;
import java.util.Map;

/**
 * 用品分类 服务类
 * @author 
 * @since 2021-03-23
 */
public interface DictionaryService extends IService<DictionaryEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

      /**
      * 用品分类转换
      * @param obj
      */
     void dictionaryConvert(Object obj);
}