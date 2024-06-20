package com.github.bruce_mig.spring_web_app.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate target, boolean done) {
        Todo todo = new Todo(++todosCount,username,description,target,done);
        todos.add(todo);
    }

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
