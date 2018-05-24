package com.edu.dao;

import com.edu.pojo.Courseselect;
import com.edu.pojo.CourseselectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseselectMapper {
    long countByExample(CourseselectExample example);

    int deleteByExample(CourseselectExample example);

    int insert(Courseselect record);

    int insertSelective(Courseselect record);

    List<Courseselect> selectByExample(CourseselectExample example);

    int updateByExampleSelective(@Param("record") Courseselect record, @Param("example") CourseselectExample example);

    int updateByExample(@Param("record") Courseselect record, @Param("example") CourseselectExample example);
}