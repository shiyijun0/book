package io.renren.modules.generator.${moduleName}.dao;

import io.renren.modules.generator.${moduleName}.entity.GoodsEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author chenshun
 * @email 617318842@qq.com
 * @date 2019-01-14 17:08:34
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
