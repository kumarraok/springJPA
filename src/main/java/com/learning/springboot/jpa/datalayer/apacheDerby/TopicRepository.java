package com.learning.springboot.jpa.datalayer.apacheDerby;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository <Topic, String> {

}
