package com.edu.dao;

import com.edu.pojo.Coursedetails;
import com.edu.pojo.CoursedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursedetailsMapper {
    long countByExample(CoursedetailsExample example);

    int deleteByExample(CoursedetailsExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Coursedetails record);

    int insertSelective(Coursedetails record);

    List<Coursedetails> selectByExample(CoursedetailsExample example);
    
    //add after
    List<Coursedetails> selectByCourseId(int courseid);

    Coursedetails selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Coursedetails record, @Param("example") CoursedetailsExample example);

    int updateByExample(@Param("record") Coursedetails record, @Param("example") CoursedetailsExample example);

    int updateByPrimaryKeySelective(Coursedetails record);

    int updateByPrimaryKey(Coursedetails record);
}