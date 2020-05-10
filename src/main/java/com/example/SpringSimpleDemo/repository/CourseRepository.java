package com.example.SpringSimpleDemo.repository;

import com.example.SpringSimpleDemo.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicID (String topicId);
}
