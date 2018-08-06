package com.smile.mapper;

import com.smile.pojo.ComplaintDO;
import com.smile.pojo.ComplaintDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ComplaintDOMapper {
    long countByExample(ComplaintDOExample example);

    int deleteByExample(ComplaintDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComplaintDO record);

    int insertSelective(ComplaintDO record);

    List<ComplaintDO> selectByExampleWithBLOBs(ComplaintDOExample example);

    List<ComplaintDO> selectByExample(ComplaintDOExample example);

    ComplaintDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComplaintDO record, @Param("example") ComplaintDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ComplaintDO record, @Param("example") ComplaintDOExample example);

    int updateByExample(@Param("record") ComplaintDO record, @Param("example") ComplaintDOExample example);

    int updateByPrimaryKeySelective(ComplaintDO record);

    int updateByPrimaryKeyWithBLOBs(ComplaintDO record);

    int updateByPrimaryKey(ComplaintDO record);
}