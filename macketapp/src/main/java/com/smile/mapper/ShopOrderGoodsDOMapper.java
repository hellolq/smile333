package com.smile.mapper;

import com.smile.pojo.ShopOrderGoodsDO;
import com.smile.pojo.ShopOrderGoodsDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ShopOrderGoodsDOMapper {
    long countByExample(ShopOrderGoodsDOExample example);

    int deleteByExample(ShopOrderGoodsDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrderGoodsDO record);

    int insertSelective(ShopOrderGoodsDO record);

    List<ShopOrderGoodsDO> selectByExampleWithBLOBs(ShopOrderGoodsDOExample example);

    List<ShopOrderGoodsDO> selectByExample(ShopOrderGoodsDOExample example);

    ShopOrderGoodsDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrderGoodsDO record, @Param("example") ShopOrderGoodsDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopOrderGoodsDO record, @Param("example") ShopOrderGoodsDOExample example);

    int updateByExample(@Param("record") ShopOrderGoodsDO record, @Param("example") ShopOrderGoodsDOExample example);

    int updateByPrimaryKeySelective(ShopOrderGoodsDO record);

    int updateByPrimaryKeyWithBLOBs(ShopOrderGoodsDO record);

    int updateByPrimaryKey(ShopOrderGoodsDO record);
}