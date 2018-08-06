package com.liqiaoyes.top.controller;

import com.liqiaoyes.top.mapper.ScGoodsMapper;
import com.liqiaoyes.top.mapper.SystemInfoMapper;
import com.liqiaoyes.top.pojo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by H1N1 on 2018/7/30.
 */
@Controller
public class GoodsController {

    @Autowired
    private ScGoodsMapper scGoodsMapper;
    @Autowired
    private SystemInfoMapper systemInfoMapper;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 小程序  详情页加载
     * */
    @ResponseBody
    @RequestMapping(value = "/detail",method = RequestMethod.POST)
    public OutReturn detail(@RequestParam int id){
        OutReturn outReturn = new OutReturn();
        GoodsDetailPageDTO goodsDetailPageDTO = new GoodsDetailPageDTO();
        ScGoods scGoods = scGoodsMapper.selectByPrimaryKey(id);
        SystemInfoExample systemInfoExample = new SystemInfoExample();
        SystemInfoExample.Criteria criteria = systemInfoExample.createCriteria();
        criteria.andIsDeleteEqualTo((byte)0);
        criteria.andInfoNameEqualTo("img_url");
        List<SystemInfo> systemInfos = systemInfoMapper.selectByExample(systemInfoExample);
        String[] mainIms = scGoods.getMainImg().split(",");
        for(int i=0;i<mainIms.length;i++){
            goodsDetailPageDTO.getMainImgs().add(systemInfos.get(0).getInfoValue()+mainIms[i]);
        }
        String[] detailIms = scGoods.getDetailImg().split(",");
        for(int i=0;i<detailIms.length;i++){
            goodsDetailPageDTO.getDetailImgs().add(systemInfos.get(0).getInfoValue()+detailIms[i]);
        }
        goodsDetailPageDTO.setScGoods(scGoods);
        outReturn.setStatus(200);
        outReturn.setMessage("SUCCESS");
        outReturn.setRes(goodsDetailPageDTO);
        return outReturn;
    }

    @ResponseBody
    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    public String testXcx(){

        return "Hello";
    }
}
