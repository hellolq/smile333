package com.liqiaoyes.top.mapper;

import com.liqiaoyes.top.pojo.ScGoods;
import com.liqiaoyes.top.pojo.ScGoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ScGoodsMapper {
    long countByExample(ScGoodsExample example);

    int deleteByExample(ScGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScGoods record);

    int insertSelective(ScGoods record);

    List<ScGoods> selectByExample(ScGoodsExample example);

    ScGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScGoods record, @Param("example") ScGoodsExample example);

    int updateByExample(@Param("record") ScGoods record, @Param("example") ScGoodsExample example);

    int updateByPrimaryKeySelective(ScGoods record);

    int updateByPrimaryKey(ScGoods record);
}