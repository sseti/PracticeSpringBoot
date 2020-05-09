package com.example.SpringSimpleDemo;

import com.example.SpringSimpleDemo.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
