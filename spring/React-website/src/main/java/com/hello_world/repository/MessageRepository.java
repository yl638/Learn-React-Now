package com.hello_world.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.hello_world.domain.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
}

 