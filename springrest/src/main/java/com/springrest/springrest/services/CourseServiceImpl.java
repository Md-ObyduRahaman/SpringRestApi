package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Course;
import com.springrest.springrest.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	
	//List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	
	

	public CourseServiceImpl() {
//		list =new ArrayList<Course>();
//		list.add(new Course(145,"java spring course","This course contain spring basic of java"));
//		list.add(new Course(146,"java basic course","This course contain java basic of java"));
	
	}



	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
		//		return list;
	}



	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for (Course course : list) {
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//			
//		}
		return courseDao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if (e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		}
//				
//				
//				);
		courseDao.save(course);
		return course;
	}



	@Override
	public void deleteCourse(long parseLong) {
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	Course entity= courseDao.getOne(parseLong);
	courseDao.delete(entity);
	}

}
