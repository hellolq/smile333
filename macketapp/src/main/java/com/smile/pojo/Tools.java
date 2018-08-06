package com.smile.pojo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by H1N1 on 2018/7/7.
 */
public class Tools {

    public static String sendXMLDataByPost(String url, String xmlData) throws Exception {
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
    //生成MD5加密密文
    public static String toMD5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes("GBK"));
            String md5=new BigInteger(1, md.digest()).toString(16);
            return fillMD5(md5);
        } catch (Exception e) {
            throw new RuntimeException("MD5加密错误:"+e.getMessage(),e);
        }
    }

    public static String fillMD5(String md5){
        return md5.length()==32?md5:fillMD5("0"+md5);
    }

    //获取客户端IP
    public static String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
            return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }

    public static void readFile(){
        File file=new File("C:\\adlx_db.sql");
        File fileRes=new File("C:\\aa.sql");
        try {
            String temp=null;
            int line=1;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((temp=reader.readLine())!=null) {

                    String tempRes = temp.replace("=utf8mb4","=utf8");
                    writeLogToTxt(tempRes,fileRes);

                line++;
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeLogToTxt(String message,File file) throws IOException{
			/*
			 * true参数表示向txt文本追加文件，false表示清空原有数据再写入新数据*/
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        bw.write(message+"\r\n");
        bw.flush();
        bw.close();

    }

    //获取日志文件文本
    public File getFile(String path) throws IOException {
        //根据文件路径创建File对象
        File file = new File(path);
        //判断文件是否存在，不存在则进一步检测目录是否存在
        if(!file.exists()){
            if(file.getParentFile().exists()){
                file.createNewFile();
            }else{
                //检查目录是否存在，不存在则创建目录
                if(file.getParentFile().mkdirs()){
                    //目录创建成功后创建文件
                    file.createNewFile();
                }
            }
        }
        return file;
    }

}
