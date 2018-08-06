package com.smile.mapper;

import com.smile.pojo.AcceptGoodsAddressDatabase;
import com.smile.pojo.CommodityContent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/11.
 */
@Mapper
@Repository
public interface AcceptGoodsAddressDatabaseMapper {
    AcceptGoodsAddressDatabase selectDefaultAddressDatabaseByPersonId(int personId);

    List<AcceptGoodsAddressDatabase> selectAllAcceptGoodsAddressDatabase(int personId);

}
