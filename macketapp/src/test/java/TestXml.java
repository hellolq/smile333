
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/**
 * Created by H1N1 on 2018/7/6.
 */
public class TestXml {

    public static void main(String[] args) throws Exception {
        TestXml hello = new TestXml();
        String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
        /*String xmlString = "<xml>" +
                "<appid>wx00f40c22064f8822</appid>" +
                "<attach>支付测试</attach>" +
                "<body>H5支付测试</body>" +
                "<mch_id>1499753432</mch_id>" +
                "<nonce_str>1add1a30ac87aa2db72f57a2375d8fec</nonce_str>" +
                "<notify_url>http://wxpay.wxutil.com/pub_v2/pay/notify.v2.php</notify_url>" +
                "<openid>oUpF8uMuAJO_M2pxb1Q9zNjWeS6o</openid>" +
                "<out_trade_no>1415659990</out_trade_no>" +
                " <spbill_create_ip>223.104.130.55</spbill_create_ip>" +
                "<total_fee>1</total_fee>" +
                "<trade_type>MWEB</trade_type>" +
                "<scene_info>{'h5_info': {'type':'Wap','wap_url': 'https://pay.qq.com','wap_name': 'com.tencent.tmgp.sgame'}}</scene_info>" +
                "<sign>FAEDBBB1DA5D09245ACFC5F9280834E6</sign>"+
        "</xml>";*/
        //String xmlString = "<xml> <appid>wx00f40c22064f8822</appid> <attach>支付测试</attach> <body>H5支付测试</body> <mch_id>1499753432</mch_id> <nonce_str>1add1a30ac87aa2db72f57a2375d8fec</nonce_str> <notify_url>http://wxpay.wxutil.com/pub_v2/pay/notify.v2.php</notify_url> <out_trade_no>1415659990</out_trade_no> <scene_info>{'h5_info': {'type':'Wap','wap_url': 'https://pay.qq.com','wap_name': 'com.tencent.tmgp.sgame'}}</scene_info> <spbill_create_ip>223.104.130.55</spbill_create_ip> <total_fee>1</total_fee> <trade_type>MWEB</trade_type> <sign>21F654F416005E50CB6716CBBD331195</sign> </xml>";
        //String xmlString = "<xml><appid>wx00f40c22064f8822</appid><attach>支付测试</attach><body>H5支付测试</body><mch_id>1499753432</mch_id><nonce_str>2gdd1a30ac87aa2db72f57a2375d8fec</nonce_str><notify_url>http://javatest.yiwowmall.com/dealWeXinpay</notify_url><out_trade_no>20160806125346</out_trade_no><scene_info>{'h5_info': {'type':'Wap','wap_url': 'http://javatest.yiwowmall.com','wap_name': 'sc'}}</scene_info><spbill_create_ip>223.104.130.65</spbill_create_ip><total_fee>1</total_fee><trade_type>MWEB</trade_type><sign>ED04D1F62FFE61A6B8F9387FE42956A0</sign></xml>";
        String xmlString = "<xml><appid>wx00f40c22064f8822</appid><attach>支付测试</attach><body>H5支付测试</body><mch_id>1499753432</mch_id><nonce_str>2gdd1a30ac87aa2db72f57a2375d8fec</nonce_str><notify_url>http://javatest.yiwowmall.com/dealWeXinpay</notify_url><out_trade_no>20160806125346</out_trade_no><scene_info>{'h5_info': {'type':'Wap','wap_url': 'http://javatest.yiwowmall.com','wap_name': 'sc'}}</scene_info><spbill_create_ip>223.104.130.65</spbill_create_ip><total_fee>1</total_fee><trade_type>MWEB</trade_type><sign>6438EA39B82314FA706C0DCBA74577A1</sign></xml>";
        String result = hello.sendXMLDataByPost(url, xmlString);
        System.out.println(result);
        Document doc = DocumentHelper.parseText(result);
        Element rootElt = doc.getRootElement(); // 获取根节点
        Element return_code = rootElt.element("mweb_url");
        System.out.println(return_code.getData());

    }

    //dom4j 解析xml
    public String paraseXml() throws Exception{
        String xmlString = "<xml>"
                + "<appid>wx2421b1c4370ec43b</appid>"
                + "<attach>支付测试</attach>"
                + "<body>H5支付测试</body>"
                + "<mch_id>10000100</mch_id>"
                + "<nonce_str>1add1a30ac87aa2db72f57a2375d8fec</nonce_str>"
                + "<notify_url>http://wxpay.wxutil.com/pub_v2/pay/notify.v2.php</notify_url>"
                + "<openid>oUpF8uMuAJO_M2pxb1Q9zNjWeS6o</openid>"
                + "<out_trade_no>1415659990</out_trade_no>"
                + "<spbill_create_ip>14.23.150.211</spbill_create_ip>"
                + "<total_fee>1</total_fee><trade_type>MWEB</trade_type>"
                + "<scene_info>{'h5_info': {'type':'IOS','app_name': '王者荣耀','package_name': 'com.tencent.tmgp.sgame'}}</scene_info>"
                + "<sign>0CB01533B8C1EF103065174F50BCA001</sign>"
                + "</xml>";
        Document doc = DocumentHelper.parseText(xmlString);
        Element rootElt = doc.getRootElement(); // 获取根节点
        System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称
        Element return_code = rootElt.element("appid");
        System.out.println(return_code.getName());
        System.out.println(return_code.getData());
        return "";
    }

    //直接发送xml
    public String sendXMLDataByPost(String url, String xmlData) throws Exception {
        org.apache.http.client.HttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        StringEntity stringEntity = new StringEntity(xmlData,"UTF-8");
        post.setEntity(stringEntity);
        HttpResponse response = client.execute(post);
        System.out.println(response.toString());
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity, "UTF-8");
        return result;
    }

}
