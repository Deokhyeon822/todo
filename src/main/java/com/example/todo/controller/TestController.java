/*
package com.example.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.todo.dto.*;
import java.util.ArrayList;
import java.util.List;

/*
* @RestController 어노테이션을 이용해 이 컨트롤러가 RestController임을 명시
* (http와 관련된 코드 및 요청/응답 매핑을 스프링이 알아서 해줌)
//*
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String testController(){
        return "Hello World!";
    }
    @GetMapping("/{id}")
    public String testControllerWithPathVariables(@PathVariable(required = false) int id){
        return "Hello world! ID " + id;
    }
    @GetMapping("/testRequestParam")
    public  String testControllerRequestParam(@RequestParam(required = false) int id){
        return "Hello World ID(request param)"+ id;
    }
    @GetMapping("/testRequestBody")
    public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO){
        return "Hello World! ID" + testRequestBodyDTO.getId() + "\nMessage : " + testRequestBodyDTO.getMessage();
    }
    @GetMapping("/testResponseBody")
    public ResponseDTO<String> testControllerResponseBody(){
        List<String> list = new ArrayList<>();
        list.add("Hello world! I'm ResponseDTO");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return response;
    }

    @GetMapping("testResponseEntity")
    public ResponseEntity<?> testControllerResponseEntity() {
        List<String> list = new ArrayList<>();
        list.add("Hello I'm Response ENTITY. And you got 400!");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        // http 응답 400
        // ResponseDTO와 ResponseEntity의 차이는 Entity는 http의 헤더와 HTTP status를 조작 가능
        return ResponseEntity.badRequest().body(response);
    }
}
*/