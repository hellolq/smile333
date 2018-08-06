package com.smile.mapper;

import com.smile.pojo.ApplyDO;
import com.smile.pojo.ApplyDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ApplyDOMapper {
    long countByExample(ApplyDOExample example);

    int deleteByExample(ApplyDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyDO record);

    int insertSelective(ApplyDO record);

    List<ApplyDO> selectByExample(ApplyDOExample example);

    ApplyDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplyDO record, @Param("example") ApplyDOExample example);

    int updateByExample(@Param("record") ApplyDO record, @Param("example") ApplyDOExample example);

    int updateByPrimaryKeySelective(ApplyDO record);

    int updateByPrimaryKey(ApplyDO record);
}