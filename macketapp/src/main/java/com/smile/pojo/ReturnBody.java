package com.smile.pojo;

import java.util.Map;

/**
 * Created by H1N1 on 2018/7/13.
 */
public class ReturnBody {

    public  static int SUCCESS = 200;// 处理成功
    public  static int FAIL = 300;//处理失败

    private int status;//请求状态
    private Map<String,Object> resultMap;//请求结果集
    private String message;//请求信息

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReturnBody{" +
                "staus='" + status + '\'' +
                ", resultMap=" + resultMap +
                ", message='" + message + '\'' +
                '}';
    }
}
