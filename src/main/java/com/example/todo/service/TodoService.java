package com.example.todo.service;

import com.example.todo.model.TodoEntity;
import com.example.todo.persistence.TodoRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<TodoEntity> create(final TodoEntity entity){
        //validation check


        repository.save(entity);
        log.info("Entity Id : {} is saved", entity.getId());

        return repository.findByUserId(entity.getUserId());
    }

    private void validate(final TodoEntity entity){
        if(entity == null){
            log.warn("Entity cannot be null.") ;
            throw new RuntimeException("Entity cannot be null");
        }

        if(entity.getUserId() == null){
            log.warn("Unknown UserId") ;
            throw new RuntimeException("Unknown UserId");
        }
    }
    //public String testService(){
        // TodoEntity 생성
     //   TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
        // TodoEntity 저장
       // repository.save(entity);
        // TodoEntity 검색
     //   TodoEntity savedEntity = repository.findById(entity.getId()).get();
     //   return savedEntity.getTitle();
    //}
}
