package com.diasbrunopersonal.tasks.services;

import com.diasbrunopersonal.tasks.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskList(TaskList taskList);
}
