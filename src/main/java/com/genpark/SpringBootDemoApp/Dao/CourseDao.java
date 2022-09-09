package com.genpark.SpringBootDemoApp.Dao;

import com.genpark.SpringBootDemoApp.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {

}
