package com.smile.controller;

import com.smile.mapper.OrderMapper;
import com.smile.pojo.OrderDatabase;
import com.smile.pojo.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by H1N1 on 2018/6/6.
 */
@Controller
public class OrderController {

    @Autowired
    private  OrderMapper orderMapper;

    //模拟登陆人员ID 为1
    int personId = 1;

    @ResponseBody
    @RequestMapping(value = "/submitOrder",method = RequestMethod.POST)
    public ResponseModel submitOrder(int acceptGoodsAddressId,
                              double receivable){
        OrderDatabase order = new OrderDatabase();
        order.setPersonId(personId);
        order.setAcceptGoodsAddressId(acceptGoodsAddressId);
        order.setReceivable(receivable);
        orderMapper.insertOrder(order);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setStatus(200);
        responseModel.setMessage("SUCCESS");
        return responseModel;

    }



}