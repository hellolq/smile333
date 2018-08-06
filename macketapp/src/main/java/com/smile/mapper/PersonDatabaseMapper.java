package com.smile.mapper;

import com.smile.pojo.PersonDatabase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by H1N1 on 2018/6/12.
 */
@Mapper
@Repository
public interface PersonDatabaseMapper {
    PersonDatabase selectPersonDatabaseByTel(String tel);
}
