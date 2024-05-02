package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiluEntity;
import java.util.Map;

/**
 * 领用记录 服务类
 * @author 
 * @since 2021-03-23
 */
public interface JiluService extends IService<JiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}