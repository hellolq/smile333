package com.smile.mapper;

import com.smile.pojo.ShopOrdersDO;
import com.smile.pojo.ShopOrdersDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ShopOrdersDOMapper {
    long countByExample(ShopOrdersDOExample example);

    int deleteByExample(ShopOrdersDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrdersDO record);

    int insertSelective(ShopOrdersDO record);

    List<ShopOrdersDO> selectByExample(ShopOrdersDOExample example);

    ShopOrdersDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrdersDO record, @Param("example") ShopOrdersDOExample example);

    int updateByExample(@Param("record") ShopOrdersDO record, @Param("example") ShopOrdersDOExample example);

    int updateByPrimaryKeySelective(ShopOrdersDO record);

    int updateByPrimaryKey(ShopOrdersDO record);
}