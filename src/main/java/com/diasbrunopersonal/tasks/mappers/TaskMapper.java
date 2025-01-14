package com.diasbrunopersonal.tasks.mappers;

import com.diasbrunopersonal.tasks.domain.dto.TaskDTO;
import com.diasbrunopersonal.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDTO(TaskDTO taskDTO);

    TaskDTO toDTO(Task task);
}
