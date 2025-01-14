package com.diasbrunopersonal.tasks.mappers;

import com.diasbrunopersonal.tasks.domain.dto.TaskListDTO;
import com.diasbrunopersonal.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDTO(TaskListDTO taskListDTO);
    TaskListDTO toDTO(TaskList taskList);
}
