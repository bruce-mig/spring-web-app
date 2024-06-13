package com.github.bruce_mig.spring_web_app.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new Todo(++todosCount,"name","learn AWS", LocalDate.now().plusMonths(3), false));
        todos.add(new Todo(++todosCount,"name","learn DevOps", LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(++todosCount,"name","learn FullStack Development", LocalDate.now().plusMonths(9), false));
    }
    public List<Todo> findByUserName(String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate target, boolean done) {
        Todo todo = new Todo(++todosCount,username,description,target,done);
        todos.add(todo);
    }
}
