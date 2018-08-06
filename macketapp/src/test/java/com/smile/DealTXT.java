package com.smile;

import com.smile.pojo.Tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by H1N1 on 2018/7/8.
 */
public class DealTXT {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddHHmmss");
        String toTalOrderNo ="A"+sdf.format(new Date())+""+((Math.random()*9+1)*1000);//总订单号
        System.out.println("toTalOrderNo:"+toTalOrderNo );
        System.out.println(sdf.format(new Date()));
        Random r = new Random();
        int result = r.ints(1000, (9998 + 1)).findFirst().getAsInt();
        System.out.println(result);
    }
}
