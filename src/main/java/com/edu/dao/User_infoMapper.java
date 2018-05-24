package com.edu.dao;

import com.edu.pojo.User_info;
import com.edu.pojo.User_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_infoMapper {
    long countByExample(User_infoExample example);

    int deleteByExample(User_infoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(User_info record);

    int insertSelective(User_info record);

    //add after
    List<User_info> getAllUsers();
    
    //
    User_info selectByUsername(String name);
    
    List<User_info> selectByExample(User_infoExample example);

    User_info selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") User_info record, @Param("example") User_infoExample example);

    int updateByExample(@Param("record") User_info record, @Param("example") User_infoExample example);

    int updateByPrimaryKeySelective(User_info record);

    int updateByPrimaryKey(User_info record);
}