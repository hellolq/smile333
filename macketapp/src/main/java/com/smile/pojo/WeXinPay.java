package com.smile.pojo;

/**
 * Created by H1N1 on 2018/7/7.
 */
public class WeXinPay {

    private String appid;//公众账号ID
    private String attach;//附加数据
    private String body;//商品描述
    private String mch_id;//商户号
    private String nonce_str;//随机字符串
    private String notify_url;//通知地址
    private String out_trade_no;//商户订单号
    private String scene_info;//场景信息
    private String spbill_create_ip;//终端IP
    private String total_fee;//总金额
    private String trade_type;//交易类型
    private String sign;//签名
    private String key;//商户Key

    public String getAppid() {
        return appid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getScene_info() {
        return scene_info;
    }

    public void setScene_info(String scene_info) {
        this.scene_info = scene_info;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String geneateResult(){
        String result = "<xml>" +
                "<appid>"+appid+"</appid>" +
                "<attach>"+attach+"</attach>" +
                "<body>"+body+"</body>" +
                "<mch_id>"+mch_id+"</mch_id>" +
                "<nonce_str>"+nonce_str+"</nonce_str>" +
                "<notify_url>"+notify_url+"</notify_url>" +
                "<out_trade_no>"+out_trade_no+"</out_trade_no>" +
                "<scene_info>"+scene_info+"</scene_info>" +
                "<spbill_create_ip>"+spbill_create_ip+"</spbill_create_ip>" +
                "<total_fee>"+total_fee+"</total_fee>" +
                "<trade_type>"+trade_type+"</trade_type>" +
                "<sign>"+sign+"</sign>" +
                "</xml>";
        return result;
    }

    @Override
    public String toString() {
        return "appid=" + appid + "&" +
                "attach=" + attach + "&" +
                "body=" + body + "&" +
                "mch_id=" + mch_id + "&" +
                "nonce_str=" + nonce_str + "&" +
                "notify_url=" + notify_url + "&" +
                "out_trade_no=" + out_trade_no + "&" +
                "scene_info=" + scene_info + "&" +
                "spbill_create_ip=" + spbill_create_ip + "&" +
                "total_fee=" + total_fee + "&" +
                "trade_type=" + trade_type + "&" +
                "key=" + key;
    }
}
