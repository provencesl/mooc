package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.CourseMapper;
import com.edu.pojo.Course;
import com.edu.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	public CourseMapper course_mapper;
	/*
	 * 根据teacherid选择课程列表
	 * (non-Javadoc)
	 * @see com.ssdut.demo.service.CourseService#getCourseByTeacherId(int)
	 */
	public List<Course> getCourseByTeacherId(int teacher_id){
		return course_mapper.getCoursesByTeacherId(teacher_id);
	}
	/*
	 * 增加课程
	 * 
	 */
	public int addCourse(Course record){
		return course_mapper.insert(record);
	}
	/*
	 * 删除课程
	 */
	public int deleteCourseById(int id){
		return course_mapper.deleteByPrimaryKey(id);
	}
	/*
	 * 根据id查找课程
	 */
	public Course getCourseByCourseId(int id){
		return course_mapper.selectByPrimaryKey(id);
	}
	/*
	 * 更新课程
	 */
	public int updateCourse(Course record){
		System.out.println("update!");
		return course_mapper.updateByPrimaryKey(record);
	}
	/*
	 * 根据种类获得课程列表
	 */
	public List<Course> getCourseByType(int type){
		return course_mapper.getCoursesByType(type);
	}
}
