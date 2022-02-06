package com.example.todo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.todo.model.TodoEntity;

import java.util.List;

//JpaRepository는 interface이므로 새로 작성해서 확장시켜줘야함
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
    //List<TodoEntity> findByUserId(String userId);

    // nativeQuery = false(default)인테 이 경우 JPQL로 작성해야함
    //@Query(value = "select * from Todo t where t.userId = ?1", nativeQuery = true)
    List<TodoEntity> findByUserId(String userId);
}
