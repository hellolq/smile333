package com.smile.mapper;

import com.smile.pojo.ShopGoodsDO;
import com.smile.pojo.ShopGoodsDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ShopGoodsDOMapper {
    long countByExample(ShopGoodsDOExample example);

    int deleteByExample(ShopGoodsDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopGoodsDO record);

    int insertSelective(ShopGoodsDO record);

    List<ShopGoodsDO> selectByExampleWithBLOBs(ShopGoodsDOExample example);

    List<ShopGoodsDO> selectByExample(ShopGoodsDOExample example);

    ShopGoodsDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopGoodsDO record, @Param("example") ShopGoodsDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopGoodsDO record, @Param("example") ShopGoodsDOExample example);

    int updateByExample(@Param("record") ShopGoodsDO record, @Param("example") ShopGoodsDOExample example);

    int updateByPrimaryKeySelective(ShopGoodsDO record);

    int updateByPrimaryKeyWithBLOBs(ShopGoodsDO record);

    int updateByPrimaryKey(ShopGoodsDO record);
}