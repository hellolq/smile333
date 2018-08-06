package com.smile.mapper;

import com.smile.pojo.CommodityContent;
import com.smile.pojo.CommodityDatabase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/11.
 */
@Mapper
@Repository
public interface CommodityContentDatabaseMapper {
    List<CommodityContent> selectAllCommodityContentDatabaseByGoodsId(int id);
}
