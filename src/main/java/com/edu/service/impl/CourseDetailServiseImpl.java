package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.CoursedetailsMapper;
import com.edu.dao.User_infoMapper;
import com.edu.pojo.Coursedetails;
import com.edu.service.CourseDetailService;

@Service
public class CourseDetailServiseImpl implements CourseDetailService{
	@Autowired
	private CoursedetailsMapper course_detailMapper;
	
	public List<Coursedetails> selectByCourseId(int courseid){
		return course_detailMapper.selectByCourseId(courseid);
	}
	public int addCourseDetails(Coursedetails record){
		return course_detailMapper.insert(record);
	} 
	public Coursedetails selectByClassId(int classid){
		return course_detailMapper.selectByPrimaryKey(classid);
	}
	public int deleteByClassId(int classid){
		return course_detailMapper.deleteByPrimaryKey(classid);
	}
}
