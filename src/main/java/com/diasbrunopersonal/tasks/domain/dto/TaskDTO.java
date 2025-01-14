package com.diasbrunopersonal.tasks.domain.dto;

import com.diasbrunopersonal.tasks.domain.entities.TaskPriority;
import com.diasbrunopersonal.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDTO(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
