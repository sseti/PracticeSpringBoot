package com.example.SpringSimpleDemo.repository;

import com.example.SpringSimpleDemo.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
}
