package com.liqiaoyes.top.mapper;

import com.liqiaoyes.top.pojo.SystemInfo;
import com.liqiaoyes.top.pojo.SystemInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SystemInfoMapper {
    long countByExample(SystemInfoExample example);

    int deleteByExample(SystemInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemInfo record);

    int insertSelective(SystemInfo record);

    List<SystemInfo> selectByExample(SystemInfoExample example);

    SystemInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByExample(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByPrimaryKeySelective(SystemInfo record);

    int updateByPrimaryKey(SystemInfo record);
}