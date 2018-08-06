package com.smile.pojo;

import java.util.Map;

/**
 * Created by H1N1 on 2018/6/14.
 */
public class ResponseModel {

    private int status;//200 响应成功
    private String message;//信息
    private Map<String,Object> result;//返回参数

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
