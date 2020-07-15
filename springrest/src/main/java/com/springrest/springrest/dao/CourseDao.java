package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.Entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
