package com.smile.controller;

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
public class FileController {



    @ResponseBody
    @RequestMapping("/fileUp")
    public Map<String, String> fileUp(@RequestParam("upfile") MultipartFile uploadFile) throws Exception {
        String filename = uploadFile.getOriginalFilename();
        String prefix = filename.substring(filename.lastIndexOf(".") + 1);
        String newFileName = UUID.randomUUID().toString().replace("-", "") + "." + prefix;
        //String path = "F:\\img\\";
        String path = "D:\\java\\workspace\\fileupload\\src\\main\\resources\\static\\img\\";
        String newFilePath = path + newFileName;
        File file = new File(newFilePath);
        uploadFile.transferTo(file);

        //返回结果信息(UEditor需要)
        Map<String, String> map = new HashMap<String, String>();
        //是否上传成功
        map.put("state", "SUCCESS");
        //现在文件名称
        map.put("title", newFileName);
        //文件原名称
        map.put("original", filename);
        //文件类型 后缀名
        map.put("type", prefix);
        //文件路径
        map.put("url", "/img/" + newFileName);
        //文件大小（字节数）
        map.put("size", uploadFile.getSize() + "");


        return map;

    }
}