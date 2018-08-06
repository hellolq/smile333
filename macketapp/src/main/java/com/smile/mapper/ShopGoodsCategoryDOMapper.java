package com.smile.mapper;

import com.smile.pojo.ShopGoodsCategoryDO;
import com.smile.pojo.ShopGoodsCategoryDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ShopGoodsCategoryDOMapper {
    long countByExample(ShopGoodsCategoryDOExample example);

    int deleteByExample(ShopGoodsCategoryDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopGoodsCategoryDO record);

    int insertSelective(ShopGoodsCategoryDO record);

    List<ShopGoodsCategoryDO> selectByExample(ShopGoodsCategoryDOExample example);

    ShopGoodsCategoryDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopGoodsCategoryDO record, @Param("example") ShopGoodsCategoryDOExample example);

    int updateByExample(@Param("record") ShopGoodsCategoryDO record, @Param("example") ShopGoodsCategoryDOExample example);

    int updateByPrimaryKeySelective(ShopGoodsCategoryDO record);

    int updateByPrimaryKey(ShopGoodsCategoryDO record);
}