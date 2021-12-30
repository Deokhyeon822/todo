package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/*
* @Builder 어노테이션을 이용하면 Builder클래스를 따로 개발하지 않고 Builder 패턴을 사용해 오브젝트 생성 가능
* ex) TodoEntity toddo = TodoEntitiy.builder()
*                           .id("t-1029392")
*                           .userId("developer")
*                           .title("Implement Moder")
*                           .build();
* @NoArgsConstructor 어노테이션을 사용하면 매개변수가 없는 생성자를 구현해줌
* @AllArgsConstructor 어노테이션은 모든 멤버 변수를 매개변수로 받는 생성자를 구현해줌
* @Data 어노테이션을 Getter/Setter 구현해줌
* ex) public String getId(){return id;} public void setId(String id){this.id = id;}
* @Entity 어노테이션을 이용하여 자바 클래스를 엔티티로 만듬
* */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Todo") // 지정하지 않을 경우 클래스 이름을 테이블 이름으로 간주
public class TodoEntity {
    @Id
    @GeneratedValue(generator = "system-uuid") // generator를 이용하여 어떤 방식으로 생성할 것인지
    @GenericGenerator(name = "system-uuid", strategy = "uuid") // 기본 제공 generator가 아니라 나만의 generator 경우
    //system-uuid라는 이름의 제너레이터는 uuid를 사용하고 이것을 @GeneratedValue가 참조해서 사용함
    private String id; // project id
    private String userId; // object creater id
    private String title; // todolist title(ex:exercise)
    private boolean done; // complete y or n
}

