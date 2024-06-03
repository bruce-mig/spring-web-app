package com.github.bruce_mig.spring_web_app.todo;

import java.time.LocalDate;

public record Todo(
        Integer id,
        String username,
        String description,
        LocalDate targetDate,
        boolean done
) {
}
