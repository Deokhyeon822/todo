package com.example.todo.controller;

import com.example.todo.model.TodoEntity;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.todo.dto.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("todo")
public class TodoController {

    @Autowired
    private TodoService service;

   /*
   public ResponseEntity<?> testTodo(){

        String str = service.testService(); // text service
        List<String> list = new ArrayList<>();
        list.add(str);
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return ResponseEntity.ok().body(response);
    }
    */

    @GetMapping
    public String hiTodo(){
        String str = "hi todo";
        return str;
    }
/*
    public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
        try {
            String temporaryUserId = "temporary-user"; // temproary user id

            //(1) TodoEntity로 변환
            TodoEntity entity = TodoDTO.toEntity(dto);
            //(2) id를 null로 초기화. 생성 당시에는 id가 없어야 하기 때문
            entity.setId(null);
            //(3) 임시 사용자 아이디를 설정. (ㄱ장 인증과 인가에서 수정할 예정)지금은 tmp만 인증 없이 로그인
            entity.setUserId(temporaryUserId);
            //(4) 서비스를 이용해 Todo엔티티 생성
            List<TodoEntity> entities = service.create(entity);
            //(5) 자바스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO 리스트로 변환
            List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
            //(6) 변환된 DTO리스트를 이용해 ResponseDTO를 초기화
            ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
            //(7) ResponseDTO 리턴
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            //(8) 예외처리
            String error = e.getMessage();
            ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
            return ResponseEntity.badRequest().body(response);
        }

    }*/
}
