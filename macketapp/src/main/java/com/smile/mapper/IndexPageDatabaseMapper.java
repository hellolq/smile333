package com.smile.mapper;

import com.smile.pojo.IndexPageDatabase;
import com.smile.pojo.OrderDatabase;
import com.smile.pojo.PersonDatabase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by H1N1 on 2018/6/12.
 */
@Mapper
@Repository
public interface IndexPageDatabaseMapper {
    //获取图片轮播图片
    List<IndexPageDatabase> selectAllIndexPageImg();
}
