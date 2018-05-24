package com.edu.service;

import java.util.List;

import com.edu.pojo.Coursedetails;

public interface CourseDetailService {

	List<Coursedetails> selectByCourseId(int courseid);
	int addCourseDetails(Coursedetails record);
	Coursedetails selectByClassId(int classid);
	int deleteByClassId(int classid);
	
}
