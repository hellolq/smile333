package com.smile.mapper;

import com.smile.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/11.
 */
@Mapper
@Repository
public interface CommodityDatabaseMapper {
    CommodityDatabase selectAllCommodityDatabase(int id);
    List<CommodityDatabase> selectCommodityDatabaseForSumbitPage(String id);

    /**
     * 热卖商品查询
     * */
    List<Commodity> selectHotGoodsFromShopgoods();

    /**
     * 新品专区商品查询
     * */
    List<Commodity> selectNewGoodsFromShopgoods();

    /**
     * 为您推荐商品查询
     * */
    List<Commodity> selectRecommendGoodsFromShopgoods();

    /**
     * 商品详情页查询
     * */
    CommodityDatabase selectShopDetailByGoodsId(String id);

    /**
     * 商品详情页查询-用户评论
     * */
    List<CommodityContent>  selectUserCommentByGoodsId(String id);

    /**
     * 购物车-页面展示
     * */
    List<GoodsCartDTO>  selectGoodsCartByUserId(String id);

    /**
     * 根据购物车ID，查询出对应的购物车信息
     * */
    List< GoodsCartDO> selectGoodsCartByCartId(@Param("cartId") String cartId);


    /**
     * 购物车-删除选中商品
     * */
    int deleteGoodsCartByUserIdAndCartId(@Param("userId") String userId,@Param("cartId") String cartId);

    /**
     * 购物车-将商品加入购物车
     * parameterType="testmaven.entity.User"
     * */
    //int addGoodsToShopCart(@Param("userId") int userId,@Param("goodsId") int goodsId,@Param("number") int number);
    int addGoodsToShopCart(GoodsCartDTO goodsCartDTO);

    /**
     * 商品提交订单页面
     * */
    List<SumbitOrderDTO> selectGoodsDetailByCartId(@Param("cartId") String cartId);

    /**
     * 加载 当前登录客户默认订单
     * */
    AddressDTO selectUserDefaultOrder(@Param("userId") String userId);

    /**
     * 加载 当前登录客户 所有地址信息
     * */
    List<AddressDTO> selectUserAllOrderAddress(@Param("userId") String userId);

    /**
     * 重新设置默认收货地址
     * */
    int updateDefaultAddress(@Param("id") int id,@Param("userid") int userid);

    /**
     * 地址添加页-显示所有省区信息
     * */
    List<ProvinceDTO> selectAllProvince();

    /**
     * 根据选择的省 查询出所有城市地址信息
     * */
    List<ProvinceDTO> selectAllCityByProvinceId(@Param("id") int id);

    /**
     * 根据选择的城市 查询出所有城市所在的区
     * */
    List<ProvinceDTO> selectAllAreaByCityId(@Param("id") int id);

    /**
     * 添加新收货地址
     * */
    int addNewReciveAddress(AddressDO addressDO);

    /**
     * 删除 收货地址
     * */
    int deleteReciveAddress(@Param("id") int id ,@Param("userId") int userId);

    /**
     * 根据地址ID 回显地址  -- 地址编辑
     * */
    AddressDO selectAddressDOByAddressId(@Param("addressId") int addressId);

    /**
     * 更新地址
     * */
    int updateAddressByAddressId(AddressDO addressDO);

    /**
     * 根据商品ID 查询出商品的详细信息
     * */
    ShopGoods getShopGoodsListByGoodsId(@Param("id") int id);

    /**
     * 根据商品ID、ShopGoodsNormId
     *查出对应的 ShopOrderGoods
     */
    ShopOrderGoods getShopOrderGoodsByGoodsIdAndShopGoodsNormId(@Param("id") int id,@Param("shopGoodsNormId") int shopGoodsNormId);

    /**
     * 根据id 从 aliclientreceivers 表中 查询出快递ID
     * */
    AliClientReceivers selectAliclientreceiversById(@Param("id") int id);

    /**
     * 向 shoporders 表中插入提交订单的数据
     * */
    int insertIntoShoporders(ShopOrders shopOrders);

    /**
     * 向 shopordersgoods 表中插入订单商品明细
     * */
    int insertIntoShopordersgoods(ShopOrderGoods shopOrderGoods);

    /**
     * 根据 shopOrders ID 查询出商品金额列表
     * */
    List<Double> selectSumXsjeByShopOrdersId(String id);

}
