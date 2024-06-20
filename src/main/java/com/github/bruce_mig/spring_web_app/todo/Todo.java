package com.github.bruce_mig.spring_web_app.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue
     private Integer id;
     private String username;
     @Size(min=5,message = "Enter at least 5 characters")
     private String description;
     private LocalDate targetDate;
     private Boolean done;
}
