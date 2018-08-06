package com.smile.controller;

import com.smile.mapper.AcceptGoodsAddressDatabaseMapper;
import com.smile.mapper.PersonDatabaseMapper;
import com.smile.pojo.AcceptGoodsAddressDatabase;
import com.smile.pojo.PersonDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/12.
 */
@Controller
public class AcceptGoodsAddressController {

    @Autowired
    private AcceptGoodsAddressDatabaseMapper acceptGoodsAddressDatabaseMapper;
    //模拟人员ID 为1
    private int persionId = 1;
    /**
     * id:当前登录人员ID 从session 中获取
     * 根据id  获取此人所有的收货地址信息，并且在 orderAddress.html 显示
     * */
    @RequestMapping(value = "/getAddAcceptAddressPage",method = RequestMethod.GET)
    public String getAddAcceptAddressPage(ModelMap map){
        List<AcceptGoodsAddressDatabase>  address =
                acceptGoodsAddressDatabaseMapper.selectAllAcceptGoodsAddressDatabase(persionId);
        map.put("address",address);
        return "orderAddress";
    }

}
