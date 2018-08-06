package com.smile;

import com.smile.pojo.WeXinPay;
import sun.security.provider.MD5;

import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;

/**
 * Created by H1N1 on 2018/7/7.
 */
public class HelloWe {

    public static void main(String[] args) {
//"gb2312"
        WeXinPay weXinPay = new WeXinPay();
        weXinPay.setAppid("wx00f40c22064f8822");
        weXinPay.setAttach("payTest");
        weXinPay.setBody("H5payTest");
        weXinPay.setKey("dddz080310694496013080zhifudddzm");
        weXinPay.setMch_id("1499753432");
        weXinPay.setNonce_str("2gdd1a30ac87aa2db72f57a2375d8fec");
        weXinPay.setNotify_url("http://javatest.yiwowmall.com/dealWeXinpay");
        weXinPay.setOut_trade_no("20160806125346");
        weXinPay.setScene_info("{'h5_info': {'type':'Wap','wap_url': 'http://javatest.yiwowmall.com','wap_name': 'sc'}}");
        //weXinPay.setSpbill_create_ip(Tools.getRemortIP(request));
        weXinPay.setSpbill_create_ip("223.104.130.65");
        weXinPay.setTotal_fee("1");
        weXinPay.setTrade_type("MWEB");
        String code = HelloWe.getMD5(weXinPay.toString()).toUpperCase();
        weXinPay.setSign(code);
        //System.out.println(weXinPay.geneateResult());
        //System.out.println(weXinPay.toString());
        System.out.println(code);

    }

    public static String getMD5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            String md5=new BigInteger(1, md.digest()).toString(16);
            //BigInteger会把0省略掉，需补全至32位
            return fillMD5(md5);
        } catch (Exception e) {
            throw new RuntimeException("MD5加密错误:"+e.getMessage(),e);
        }
    }

    public static String fillMD5(String md5){
        return md5.length()==32?md5:fillMD5("0"+md5);
    }
}
