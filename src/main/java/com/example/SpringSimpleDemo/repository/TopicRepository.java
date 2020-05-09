package com.example.SpringSimpleDemo.repository;

import com.example.SpringSimpleDemo.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
