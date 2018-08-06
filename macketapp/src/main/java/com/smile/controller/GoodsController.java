package com.smile.controller;

import com.smile.mapper.*;
import com.smile.pojo.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by H1N1 on 2018/5/27.
 */
@Controller
public class GoodsController {

    @Autowired
    private CommodityDatabaseMapper commodityDatabaseMapper;

    @Autowired
    private CommodityContentDatabaseMapper commodityContentDatabaseMapper;

    @Autowired
    private AcceptGoodsAddressDatabaseMapper acceptGoodsAddressDatabaseMapper;

    @Autowired
    private IndexPageDatabaseMapper indexPageDatabaseMapper;

    @Autowired
    private ShopGoodsDOMapper shopGoodsDOMapper;

    @Autowired
    private ShopGoodsCategoryDOMapper shopGoodsCategoryDOMapper;

   @Autowired
    private ShopOrdersDOMapper shopOrdersDOMapper;

    @Autowired
    private ShopOrderGoodsDOMapper shopOrderGoodsDOMapper;

    @Autowired
    private ComplaintDOMapper complaintDOMapper;

    @Autowired
    private ApplyDOMapper applyDOMapper;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private int userId = 2;

    private static Map<String,String> mapUrl = new HashMap<>();

   static {
       mapUrl.put("index","/indexOne");//首页地址
       mapUrl.put("category","/toCategory/32");//分类页面
       mapUrl.put("vipPage","/toVipPage");//VIP 页面
       mapUrl.put("goodsCart","/myCart");//购物车链接
       mapUrl.put("orderCenter","/orderCenter");//订单中心
   }

    /**
     * 小程序测试
     * */
    @ResponseBody
    @RequestMapping(value = "/testXcx",method = RequestMethod.GET)
    public ReturnBody testXcx(){
        ReturnBody result = new ReturnBody();
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("hello","smile");
        result.setResultMap(resMap);
        result.setStatus(ReturnBody.SUCCESS);
        return result;
    }

    /**
     * 银行卡表单提交
     * */
    @ResponseBody
    @RequestMapping(value = "/subBankForm",method = RequestMethod.POST)
    public ReturnBody subBankForm(ApplyDO obj){
        ReturnBody result = new ReturnBody();
        obj.setUserid(userId);
       int num =applyDOMapper.insert(obj);
        if(num > 0){
            result.setStatus(ReturnBody.SUCCESS);
        }else{
            result.setStatus(ReturnBody.FAIL);
        }
        return result;
    }

    /**
     * 帮助与反馈表单提交
     * */
    @ResponseBody
    @RequestMapping(value = "/subComplaint",method = RequestMethod.POST)
    public ReturnBody subComplaint(ComplaintDO obj){
        ReturnBody result = new ReturnBody();
        obj.setUserid(userId);
         int num = complaintDOMapper.insert(obj);
         if(num > 0){
             result.setStatus(ReturnBody.SUCCESS);
         }else{
             result.setStatus(ReturnBody.FAIL);
         }
        return result;
    }


    @ResponseBody
    @RequestMapping(value = "/dealWeXinpay")
    public String dealWeXinpay(HttpServletRequest request,HttpServletResponse response){
        /*Document doc = DocumentHelper.parseText();
        Element rootElt = doc.getRootElement(); // 获取根节点
        Element return_code = rootElt.element("mweb_url");*/
        String xmlStr = "";
        try {
            InputStream inputStream = request.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String s; // 依次循环，至到读的值为空
            StringBuilder sb = new StringBuilder();
            while ((s = reader.readLine()) != null) {
                sb.append(s);
            }
            reader.close();
            xmlStr = sb.toString();
            logger.info("dealWeXinpay","xmlStr:"+xmlStr);
            System.out.println("xmlStr: "+xmlStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlStr;
    }

    /**
     * 根据省区 查询城市
     * */
    @ResponseBody
    @RequestMapping(value = "/showCity",method = RequestMethod.POST)
    public ReturnBody getCityByProvinceId(int id){
        ReturnBody result = new ReturnBody();
        Map<String,Object> mapRes = new HashMap<>();
        List<ProvinceDTO> city = commodityDatabaseMapper.selectAllCityByProvinceId(id);
        result.setStatus(ReturnBody.SUCCESS);
        mapRes.put("city",city);
        result.setResultMap(mapRes);
        return result;
    }

    /**
     * 根据城市 查询城市所在的区
     * */
    @ResponseBody
    @RequestMapping(value = "/showArea",method = RequestMethod.POST)
    public ReturnBody getAreaByCityId(int id){
        ReturnBody result = new ReturnBody();
        Map<String,Object> mapRes = new HashMap<>();
        List<ProvinceDTO> city = commodityDatabaseMapper.selectAllAreaByCityId(id);
        result.setStatus(ReturnBody.SUCCESS);
        mapRes.put("city",city);
        result.setResultMap(mapRes);
        return result;
    }

    /**
     * 新增新地址
     * */
    @ResponseBody
    @RequestMapping(value = "/addNewAddress",method = RequestMethod.POST)
    public ReturnBody addNewAddress(AddressDO addressDO){
        ReturnBody result = new ReturnBody();
        addressDO.setUserId(userId);
        int num = commodityDatabaseMapper.addNewReciveAddress(addressDO);
        if(num > 0){
            result.setStatus(ReturnBody.SUCCESS);
        }else{
            result.setStatus(ReturnBody.FAIL);
        }
        return result;
    }

    /**
     * 修改 新地址
     * */
    @ResponseBody
    @RequestMapping(value = "/updateAddress",method = RequestMethod.POST)
    public ReturnBody updateAddress(AddressDO addressDO){
        ReturnBody result = new ReturnBody();
        addressDO.setUserId(userId);
        int num = commodityDatabaseMapper.updateAddressByAddressId(addressDO);
        if(num > 0){
            result.setStatus(ReturnBody.SUCCESS);
        }else{
            result.setStatus(ReturnBody.FAIL);
        }
        return result;
    }

    /**
     * 提交订单
     * cartId : 购物车ID
     * receiverId ： 收货地址ID
     * */
    @ResponseBody
    @RequestMapping(value = "/subOrder",method = RequestMethod.POST)
    public ReturnBody submitOrder(@RequestParam("cartId") String cartId,@RequestParam("receiverId") int receiverId,
                                  @RequestParam("leaveWord") String leaveWord){
        ReturnBody result = new ReturnBody();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddHHmmss");
        Map<String,ShopOrders> orders = new HashMap<>();//订单Map
        List< GoodsCartDO> cart =   commodityDatabaseMapper.selectGoodsCartByCartId(cartId);//购物车里的商品对应记录
        AliClientReceivers address = commodityDatabaseMapper.selectAliclientreceiversById(receiverId);//根据 receiverId 查询收货信息
        Random r = new Random();
        int randomData = r.ints(1000, (9998 + 1)).findFirst().getAsInt();
        String toTalOrderNo ="A"+sdf.format(new Date())+""+randomData;//总订单号
        for(int i=0;i<cart.size();i++){
            GoodsCartDO temp = cart.get(i);
            int goodsId = temp.getGoodsId();
            int normsId = temp.getNormsId();
            int supplierId = temp.getSupplierId();
            ShopOrderGoods shopOrderGoodsTemp = commodityDatabaseMapper.getShopOrderGoodsByGoodsIdAndShopGoodsNormId(goodsId,normsId);
            ShopGoods shopGoods = commodityDatabaseMapper.getShopGoodsListByGoodsId(goodsId);//根据ID 查询出商品信息
            shopOrderGoodsTemp.setOrderNo(toTalOrderNo+supplierId);
            shopOrderGoodsTemp.setGoodsNum(temp.getNumber());
            if(orders.containsKey(supplierId)){
                orders.get(supplierId).getShopOrderGoods().add(shopOrderGoodsTemp);
            }else{
                ShopOrders shopOrders = new ShopOrders();
                shopOrders.setUserId(userId);
                shopOrders.setToTalOrderNo(toTalOrderNo);
                shopOrders.setOrderNo(toTalOrderNo+supplierId);
                shopOrders.setOrderState(0);
                shopOrders.setPayType(0);
                shopOrders.setPayState(0);
                shopOrders.setExpressId(0);//用户选择快递ID
                shopOrders.setExpressName("");//快递名称
                shopOrders.setExpressTemplateId(shopGoods.getExpressTemplateId());//快递模版ID
                shopOrders.setGoodsTotalCostPrice(shopOrders.getGoodsTotalCostPrice()+shopGoods.getCostPrice());//商品总成本价
                shopOrders.setGoodsTotalPrice(shopOrders.getGoodsTotalPrice()+shopGoods.getSalesPrice());//商品总价
                shopOrders.setGoodsTotalPVPrice(shopOrders.getGoodsTotalPVPrice()+shopGoods.getPv());//订单总PV
                shopOrders.setExpressPrice(0);//缺少快递价格
                shopOrders.setTotalPrice(shopOrders.getGoodsTotalPrice()+shopOrders.getExpressPrice());//总价格计算方式
                shopOrders.setRemark("3");//
                //shopOrders.setPayTime();//支付时间  此参数支付成功时插入
                //shopOrders.setOuttranOrderNo(); 第三方支付流水号  此参数支付成功时插入
                shopOrders.setLeaveWord(leaveWord);//用户留言
                //shopOrders.setLeaveWordTwo(); 商户发货填入
                shopOrders.setBalanceOne(0);//订单结算使用积分(金豌豆)
                shopOrders.setBalanceTwo(0);//订单结算使用积分(银豌豆)
                shopOrders.setIntegral(0);//订单结算使用积分
                shopOrders.setWeixinMoney(0);//使用微信支付多少钱
                shopOrders.setReceiverName(address.getRealName());//收货人
                shopOrders.setReceiverMobile(address.getTelPhone());//收货人电话
                shopOrders.setReceiverProvinceId(address.getProvinceId());//省区ID
                shopOrders.setReceiverCityId(address.getCityId());//城市ID
                shopOrders.setReceiverAreaId(address.getAreaId());//区ID
                shopOrders.setReceiverAddress(address.getAddress());//收货地址
                //shopOrders.setSendExpressId();//发货快递ID 发货时填入
                //shopOrders.setSendExpressName();//发货快递名称 发货时填入
                //shopOrders.getSendExpressNo();//发货快递单号 发货时填入
                shopOrders.setInvoice(0);//是否需要开发票
                shopOrders.setInvoiceType("");//发票类型
                shopOrders.setInvoiceTitle("");//发票标题
                //shopOrders.setH5PayOrderNo("");//H5支付单号  支付时填入
                //shopOrders.setWxOpenId("");//H5支付单号，支付时填入
                //shopOrders.setNewTime();//发货时间  发货时填入
                shopOrders.setBargainId(0);//砍价ID
                shopOrders.setAllowMaxUseIntegral(shopGoods.getMaxUseIntegral());//允许使用最多的积分
                //shopOrders.setRealUseIntegral(); //支付时填入
                //shopOrders.setTotalPriceTwo(); //现金+金币支付时，总订单使用现金多少(含运费） 支付时填入
                //shopOrders.setGoodsTotalPriceTwo();//现金+金币支付时，总现金多少（仅商品部分）
                //shopOrders.setUseIntegralPay();//是否使用虚拟货币

                shopOrders.getShopOrderGoods().add(shopOrderGoodsTemp);
                orders.put(supplierId+"",shopOrders);
            }

        }

        for (ShopOrders temp : orders.values()) {
            commodityDatabaseMapper.insertIntoShoporders(temp);
            List<ShopOrderGoods> shopOrderGoods = temp.getShopOrderGoods();
            for(int i=0;i<shopOrderGoods.size();i++){
                ShopOrderGoods sog = shopOrderGoods.get(i);
                sog.setOrderId(temp.getId());
                commodityDatabaseMapper.insertIntoShopordersgoods(sog);
            }
        }
        commodityDatabaseMapper.deleteGoodsCartByUserIdAndCartId(userId+"",cartId);
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("toTalOrderNo",toTalOrderNo);
        result.setStatus(200);
        result.setResultMap(resMap);
        return result;
    }

    /**
     * 编辑收货地址信息
     * */
    @RequestMapping(value = "/editAddress/{id}")
    public String toEditRecivePage(@PathVariable("id") int  id,ModelMap map){
        AddressDO address = commodityDatabaseMapper.selectAddressDOByAddressId(id);
        List<ProvinceDTO> province = commodityDatabaseMapper.selectAllProvince();
        List<ProvinceDTO> city = commodityDatabaseMapper.selectAllCityByProvinceId(address.getProvinceId());
        List<ProvinceDTO> area = commodityDatabaseMapper.selectAllAreaByCityId(address.getCityId());
        map.addAttribute("province",province);
        map.addAttribute("city",city);
        map.addAttribute("area",area);
        map.addAttribute("address",address);
        return "editAddress";
    }
    /**
     * 删除地址
     * */
    @ResponseBody
    @RequestMapping(value = "/delAddress",method = RequestMethod.POST)
    public ReturnBody deleteAddress(@RequestParam("id") int id){
        ReturnBody result = new ReturnBody();
        int num = commodityDatabaseMapper.deleteReciveAddress(id,userId);
        if(num > 0){
            result.setStatus(ReturnBody.SUCCESS);
        }else{
            result.setStatus(ReturnBody.FAIL);
        }
        return result;
    }

    /**
     * 新增收货地址页面
     * */
    @RequestMapping(value = "/toAaddNewAddressPage",method = RequestMethod.GET)
    public String toAaddNewAddressPage(ModelMap map){
        List<ProvinceDTO> result = commodityDatabaseMapper.selectAllProvince();
        map.addAttribute("result",result);
       return "addAddress";
    }

    /**
     *访问 订单中心 页面
     * */
    @RequestMapping(value = "/orderCenter",method = RequestMethod.GET)
    public String toOrderCenter(ModelMap map){
        map.put("mapUrl",mapUrl);
        return "order";
    }
    /**
     *根据status 和 userId 查询出符合条件的订单
     * payState : 大于10 - 支付状态（0待支付，1已支付，2退款中，3退款成功，4退款失败）
     * orderState : 订单状态（0正常，1取消，2待发货，3已发货，4已完成）
     * */
    public List<ShopOrdersDO> getShopOrdersDO(int payState,int orderState){
        ShopOrdersDOExample shopOrdersDOExample = new ShopOrdersDOExample();
        ShopOrdersDOExample.Criteria shopOrdersDOExampleCriteria = shopOrdersDOExample.createCriteria();
        shopOrdersDOExampleCriteria.andIsdeletedEqualTo((byte)0);
        shopOrdersDOExampleCriteria.andUseridEqualTo(userId);
        if( payState > -1 && payState < 10){
            shopOrdersDOExampleCriteria.andPaystateEqualTo(payState);
        }
        if( orderState > -1 && orderState < 10){
            shopOrdersDOExampleCriteria.andOrderstateEqualTo(orderState);
        }
        List<ShopOrdersDO> dfk_orders = shopOrdersDOMapper.selectByExample(shopOrdersDOExample);//代付款
        for(int i=0;i<dfk_orders.size();i++){
            ShopOrdersDO temp = dfk_orders.get(i);
            ShopOrderGoodsDOExample shopOrderGoodsDOExample = new ShopOrderGoodsDOExample();
            ShopOrderGoodsDOExample.Criteria criteriaTemp = shopOrderGoodsDOExample.createCriteria();
            criteriaTemp.andIsdeletedEqualTo((byte)0);
            criteriaTemp.andOrderidEqualTo(temp.getId());
            List<ShopOrderGoodsDO> goods = shopOrderGoodsDOMapper.selectByExample(shopOrderGoodsDOExample);
            temp.setShopOrderGoodsDO(goods);
        }
        return dfk_orders;
    }



    /**
     *访问 我的订单  页面
     * */
   @RequestMapping(value = "/myOrder/{id}",method = RequestMethod.GET)
    public String toMyOrder(ModelMap map,@PathVariable("id") String id){
       List<ShopOrdersDO> all_orders = getShopOrdersDO(20,20);//全部订单
       List<ShopOrdersDO> dfk_orders = getShopOrdersDO(0,0);//待付款订单
       List<ShopOrdersDO> wc_orders = getShopOrdersDO(-1,4);//已完成订单
       map.put("aim",id);
       map.addAttribute("all_orders",all_orders);
       map.addAttribute("dfk_orders",dfk_orders);
       map.addAttribute("wc_orders",wc_orders);
       return "myOrder";
    }

    /**
     *访问 购物车  页面
     * */
    @RequestMapping(value = "/myCart",method = RequestMethod.GET)
    public String toMyCart(ModelMap map){
        List<GoodsCartDTO> goodsCart =  commodityDatabaseMapper.selectGoodsCartByUserId(userId+"");
        map.addAttribute("goodsCart",goodsCart);
        map.addAttribute("mapUrl",mapUrl);
        return "myCart";
    }

    /**
     * 访问 \static\message.html
     * */
    @RequestMapping(value = "/toMessage",method = RequestMethod.GET)
    public String toMessage(){

        return "message";
    }

    /**
     * 访问主页
     * 访问  static/index_one.html
     * */
    @RequestMapping(value = "/indexOne",method = RequestMethod.GET)
    public String toIndex_one(ModelMap map){

        List<Commodity> hotGoods =  commodityDatabaseMapper.selectHotGoodsFromShopgoods();//超值热卖
        List<Commodity> newGoods = commodityDatabaseMapper.selectNewGoodsFromShopgoods();//超值新品
        List<Commodity> recommendGoods = commodityDatabaseMapper.selectRecommendGoodsFromShopgoods();//为您推荐

        //加载商品类别
        ShopGoodsCategoryDOExample shopGoodsCategoryDOExample = new ShopGoodsCategoryDOExample();
        ShopGoodsCategoryDOExample.Criteria criteriaCategory = shopGoodsCategoryDOExample.createCriteria();
        criteriaCategory.andIsdeletedEqualTo((byte)0);
        List<ShopGoodsCategoryDO> category = shopGoodsCategoryDOMapper.selectByExample(shopGoodsCategoryDOExample);
        map.put("category",category);
        map.addAttribute("hotGoods",hotGoods);//超值热卖
        map.addAttribute("newGoods",newGoods);//超值新品
        map.addAttribute("recommendGoods",recommendGoods);//为您推荐
        map.addAttribute("mapUrl",mapUrl);
        return "index_one";
    }

    /**
     * 访问分类页面
     * 访问  static/category.html
     * */
    @RequestMapping(value = "/toCategory/{id}",method = RequestMethod.GET)
    public String toCategory(ModelMap map,@PathVariable("id") int id){
        //记载商品
        ShopGoodsDOExample shopGoodsDOExample = new ShopGoodsDOExample();
        ShopGoodsDOExample.Criteria criteria = shopGoodsDOExample.createCriteria();
        criteria.andCategoryidEqualTo(id);
        byte temp = 0;
        criteria.andIsdeletedEqualTo(temp);
        List<ShopGoodsDO> res = shopGoodsDOMapper.selectByExample(shopGoodsDOExample);
        map.put("shops",res);
        //加载商品类别
        ShopGoodsCategoryDOExample shopGoodsCategoryDOExample = new ShopGoodsCategoryDOExample();
        ShopGoodsCategoryDOExample.Criteria criteriaCategory = shopGoodsCategoryDOExample.createCriteria();
        criteriaCategory.andIsdeletedEqualTo(temp);
        List<ShopGoodsCategoryDO> category = shopGoodsCategoryDOMapper.selectByExample(shopGoodsCategoryDOExample);
        map.put("category",category);
        map.put("index",id);

        map.put("mapUrl",mapUrl);
        return "category";
    }

    /**
     * 访问 VIP 页面
     * 访问  static/vipPage.html
     * */
    @RequestMapping(value = "/toVipPage",method = RequestMethod.GET)
    public String toVipPage(ModelMap map){
        ShopGoodsDOExample shopGoodsDOExample = new ShopGoodsDOExample();
        ShopGoodsDOExample.Criteria criteria = shopGoodsDOExample.createCriteria();
        criteria.andIsdeletedEqualTo((byte) 0);
        criteria.andIsspecialgoodsEqualTo((byte) 1);
        List<ShopGoodsDO> res = shopGoodsDOMapper.selectByExample(shopGoodsDOExample);
        map.addAttribute("vipShop",res);
        map.put("mapUrl",mapUrl);
        return "vipPage";
    }

    /**
     * 访问 评论 页面
     * 访问  static/content.html
     * */
    @RequestMapping(value = "/toContentPage/{id}",method = RequestMethod.GET)
    public String toContentPage(ModelMap map){
        map.put("mapUrl",mapUrl);
        return "content";
    }

    /**
     * 访问 订单详情  页面
     * 访问  static/content.html
     * */
    @RequestMapping(value = "/toOrderDetail/{id}",method = RequestMethod.GET)
    public String toOrderDetail(ModelMap map,@PathVariable("id") String id){
        ShopOrdersDOExample shopOrdersDOExample = new ShopOrdersDOExample();
        ShopOrdersDOExample.Criteria criteria = shopOrdersDOExample.createCriteria();
        criteria.andIsdeletedEqualTo((byte)0);
        criteria.andOrdernoEqualTo(id);
        List<ShopOrdersDO> shopOrdersDOS = shopOrdersDOMapper.selectByExample(shopOrdersDOExample);

        ShopOrderGoodsDOExample shopOrderGoodsDOExample = new ShopOrderGoodsDOExample();
        ShopOrderGoodsDOExample.Criteria shopOrderGoodsDOExampleCriteria = shopOrderGoodsDOExample.createCriteria();
        shopOrderGoodsDOExampleCriteria.andIsdeletedEqualTo((byte)0);
        shopOrderGoodsDOExampleCriteria.andOrdernoEqualTo(shopOrdersDOS.get(0).getOrderno());
        List<ShopOrderGoodsDO> shopOrderGoodsDOS = shopOrderGoodsDOMapper.selectByExample(shopOrderGoodsDOExample);
        shopOrdersDOS.get(0).setShopOrderGoodsDO(shopOrderGoodsDOS);
        map.addAttribute("shopOrdersDOS",shopOrdersDOS.get(0));
        return "orderDetail";
    }


    @RequestMapping(value = "/getSumbitPage/{id}",method = RequestMethod.GET)
    public String getSumbitPage(@PathVariable("id") String id,ModelMap map){
        SumbitPage sumbitPage = new SumbitPage();
        AcceptGoodsAddressDatabase address =
        acceptGoodsAddressDatabaseMapper.selectDefaultAddressDatabaseByPersonId(1);
        sumbitPage.setAddress(address);
        String dealId = id.substring(0,id.length());
        List<CommodityDatabase> commodityDatabases = commodityDatabaseMapper.selectCommodityDatabaseForSumbitPage(dealId);
        sumbitPage.setCommodityDatabase(commodityDatabases);
        sumbitPage.setPostage(0d);
        double sumXsje = 0d;
        for(int i=0;i<commodityDatabases.size();i++){
            double temp = commodityDatabases.get(i).getDiscount() * commodityDatabases.get(i).getPrice();
            sumXsje = sumXsje + temp;
        }
        sumbitPage.setSumXsje(sumXsje);
        map.put("sumbitPage",sumbitPage);
        return "sumbitOrder";
    }

    @ResponseBody
    @RequestMapping(value = "/weXinPay",method = RequestMethod.POST)
    public Map<String,String> weXinPay(HttpServletRequest request){
        String nonce_str = UUID.randomUUID().toString().replace("-","");
        WeXinPay weXinPay = new WeXinPay();
        weXinPay.setAppid("wx00f40c22064f8822");
        weXinPay.setAttach("payTest");
        weXinPay.setBody("H5payTest");
        weXinPay.setKey("dddz080310694496013080zhifudddzm");
        weXinPay.setMch_id("1499753432");
        weXinPay.setNonce_str(nonce_str);
        weXinPay.setNotify_url("http://javatest.yiwowmall.com/dealWeXinpay");
        Random random = new Random();
        String out_trade_no = (random.nextLong()+"").substring(1,15);
        weXinPay.setOut_trade_no(out_trade_no);
        weXinPay.setScene_info("{'h5_info': {'type':'Wap','wap_url': 'http://javatest.yiwowmall.com','wap_name': 'sc'}}");
        weXinPay.setSpbill_create_ip(Tools.getRemortIP(request));
        //weXinPay.setSpbill_create_ip("223.104.130.65");
        weXinPay.setTotal_fee("1");
        weXinPay.setTrade_type("MWEB");
        weXinPay.setSign(Tools.toMD5(weXinPay.toString()).toUpperCase());
        String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
        String xmlString = weXinPay.geneateResult();
        String responseStr = "";
        String redirictUrl = "";
        try {
            responseStr = Tools.sendXMLDataByPost(url,xmlString);
            Document doc = DocumentHelper.parseText(responseStr);
            Element rootElt = doc.getRootElement(); // 获取根节点
            Element return_code = rootElt.element("return_code");
            if(return_code.getData().equals("SUCCESS")){
                Element mweb_url = rootElt.element("mweb_url");
                redirictUrl = (String)mweb_url.getData();
            }else{
                System.out.println("responseStr"+responseStr);
                System.out.println("xmlString"+xmlString);
                System.out.println("weXinPay"+weXinPay.toString());
                System.out.println("sign:"+weXinPay.getSign());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //return "redirect:"+redirictUrl;
        Map<String,String> map = new HashMap<>();
        map.put("url",redirictUrl);

        System.out.println("weUrl:"+redirictUrl+"ip:"+Tools.getRemortIP(request));
        return map;
    }
    /**
     * 购物车-页面展示
     * */
    @RequestMapping(value = "/goodsCart",method = RequestMethod.GET)
    public String showGoodsCart(ModelMap map){
        List<GoodsCartDTO> goodsCart =  commodityDatabaseMapper.selectGoodsCartByUserId(userId+"");
        map.addAttribute("goodsCart",goodsCart);
        map.addAttribute("mapUrl",mapUrl);
        return "goodsCart";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getIndexPage(ModelMap map){

        IndexPage indexPage = new IndexPage();
        List<IndexPageDatabase> headImgs = new ArrayList<>();
        IndexPageDatabase tempImg = new IndexPageDatabase();
        tempImg.setId(111);
        tempImg.setImgUrl("http://rs.yiwowmall.com/api/GetResources/255620");
        headImgs.add(tempImg);
        headImgs.add(tempImg);
        headImgs.add(tempImg);
        headImgs.add(tempImg);
        indexPage.setHeadImgs(headImgs);

        //新品专区
        List<Commodity> newGoods = commodityDatabaseMapper.selectNewGoodsFromShopgoods();
        indexPage.setNewGoodsImags(newGoods);
        //超值热卖
        List<Commodity> hotGoods =  commodityDatabaseMapper.selectHotGoodsFromShopgoods();
        indexPage.setHotSaleImgs(hotGoods);
        //为您推荐
        List<Commodity> recommendGoods = commodityDatabaseMapper.selectRecommendGoodsFromShopgoods();
        indexPage.setRecommendGoodsImags(recommendGoods);
        map.addAttribute("indexPage",indexPage);
        map.addAttribute("mapUrl",mapUrl);
        logger.info("getIndexPage: {}","日志测试");
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/deleteCart",method = RequestMethod.POST)
    public ReturnBody deleteGoodsCartByCartIdAndUserId(ModelMap map, HttpServletRequest request){
        String id = request.getParameter("cartId");
        int result = commodityDatabaseMapper.deleteGoodsCartByUserIdAndCartId(userId+"",id);
        System.out.println("result:"+result+"cartId:"+id);
        ReturnBody body = new ReturnBody();
        if(result > 0){
            body.setStatus(ReturnBody.SUCCESS);
        }
        return body;
    }

    /**
     * 加入购物车
     * */
    @ResponseBody
    @RequestMapping(value = "/putGoodsToCart",method = RequestMethod.POST)
    public ReturnBody putGoodsToCart(ModelMap map, GoodsCartDO model){
        ReturnBody result = new ReturnBody();
        GoodsCartDTO temp = new GoodsCartDTO();
        temp.setName(userId+"");
        temp.setGoodsid(model.getGoodsId());
        temp.setNumber(model.getNumber());
        commodityDatabaseMapper.addGoodsToShopCart(temp);
        result.setStatus(ReturnBody.SUCCESS);
        Map<String,Object> reMap = new HashMap<>();
        reMap.put("id",temp.getId());
        result.setResultMap(reMap);
        return result;
    }

    /**
     * 提交订单
     * id : 购物车ID
     * */
    @RequestMapping(value = "/subOrdeList/{id}",method = RequestMethod.GET)
    public String getGoodsListToPay(ModelMap map,@PathVariable("id") String id){
        Map<String,Object> resultMap = new HashMap<>();
        List<SumbitOrderDTO> results = commodityDatabaseMapper.selectGoodsDetailByCartId(id);
        AddressDTO address = commodityDatabaseMapper.selectUserDefaultOrder(userId+"");
        double sum_postage = 0;
        double sum_xsje = 0;
        for(int i=0;i<results.size();i++){
            SumbitOrderDTO temp = results.get(i);
            sum_postage = temp.getPostage() + sum_postage;
            sum_xsje = temp.getNumber() * temp.getPrice() + sum_xsje;
        }
        map.put("sum_xsje",sum_xsje);
        map.put("sum_postage",sum_postage);
        map.put("results",results);
        map.put("all",sum_xsje+sum_postage);
        map.put("address",address);
        map.put("cartId",id);
        return "sumbitOrder";
    }

    /**
     * 重新设置默认收货地址
     * */
    @ResponseBody
    @RequestMapping(value = "/updateDefaultAddress",method = RequestMethod.POST)
    public ReturnBody updateDefaultAddress(HttpServletRequest request){
        ReturnBody result = new ReturnBody();
        String id = request.getParameter("id");
        int num = commodityDatabaseMapper.updateDefaultAddress(Integer.parseInt(id),userId);
        if(num > 0){
            result.setStatus(ReturnBody.SUCCESS);
        }else{
            result.setStatus(ReturnBody.FAIL);
        }
        return result;
    }
    /**
     * 收货地址管理页面
     * 访问 static/orderAddress.html
     * */
    @RequestMapping(value = "/address",method = RequestMethod.GET)
    public String managerReceipt(ModelMap map){
        List<AddressDTO> result = commodityDatabaseMapper.selectUserAllOrderAddress(userId+"");
        map.addAttribute("result",result);
        return "orderAddress";
    }

    /**
     * 帮助与反馈页面
     * 访问 static/help.html
     * */
    @RequestMapping(value = "/toHelp",method = RequestMethod.GET)
    public String toHelpPage(ModelMap map){

        return "help";
    }

    /**
     * 银行卡管理
     * 访问 static/bankCard.html
     * */
    @RequestMapping(value = "/toBankCard",method = RequestMethod.GET)
    public String toBankCard(ModelMap map){

        return "bankCard";
    }

    /**
     * 诚信经营承若书
     * 访问 static/document.html
     * */
    @RequestMapping(value = "/toDocumentPage",method = RequestMethod.GET)
    public String toDocumentPage(ModelMap map){

        return "document";
    }

    @RequestMapping(value = "/showView/{id}",method = RequestMethod.GET)
    public String getGoodsDetail(ModelMap map, @PathVariable("id") String id){
        Commodity commodity = new Commodity();
        CommodityDatabase commodityDetail = commodityDatabaseMapper.selectShopDetailByGoodsId(id);
        String[] headImgsArray = commodityDetail.getHeadImgs().split(",");
        List<String> headImgs = Arrays.asList(headImgsArray);
        commodity.setId(commodityDetail.getId());
        commodity.setHeadImgs(headImgs);//商品头部图片轮播
        commodity.setViewImg(commodityDetail.getViewImg());//商品窗口照片
        commodity.setGoodsName(commodityDetail.getGoodsName());//商品名称
        commodity.setPrice(commodityDetail.getPrice());//商品价格
        commodity.setMarketPrice(commodityDetail.getMarketPrice()+"");//商品市场价
        commodity.setGoodsNum(commodityDetail.getGoodsNum());//商品销量
        commodity.setGoodsStock(commodityDetail.getGoodsStock());//商品库存
        commodity.setGoodsDetailHtml(commodityDetail.getGoodsDetailHtml());

       List<CommodityContent> commodityContents = commodityDatabaseMapper.selectUserCommentByGoodsId(id);
        commodity.setCommodityContents(commodityContents);
        commodity.setId(id);
        map.addAttribute("commodity",commodity);
        map.put("mapUrl",mapUrl);
        return "detail";
    }

    /**
     * 跳转支付界面
     * */
    @RequestMapping(value = "/toPayPage/{id}",method = RequestMethod.GET)
    public String to_payPage(ModelMap map,@PathVariable("id") String id){
        double xsjeSum = 0;
        List<Double> res = commodityDatabaseMapper.selectSumXsjeByShopOrdersId(id);
        for(int i=0;i<res.size();i++){
            xsjeSum += res.get(i);
        }
        map.put("shopNum",res.size());
        map.put("xsjeSum",xsjeSum);
        map.put("orderId",id);
        return "pay";
    }



}
