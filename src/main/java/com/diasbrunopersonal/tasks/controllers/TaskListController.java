package com.diasbrunopersonal.tasks.controllers;

import com.diasbrunopersonal.tasks.domain.dto.TaskListDTO;
import com.diasbrunopersonal.tasks.domain.entities.TaskList;
import com.diasbrunopersonal.tasks.mappers.TaskListMapper;
import com.diasbrunopersonal.tasks.services.TaskListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/task-lists")
public class TaskListController {

    private final TaskListService taskListService;
    private final TaskListMapper taskListMapper;

    public TaskListController(TaskListService taskListService, TaskListMapper taskListMapper) {
        this.taskListService = taskListService;
        this.taskListMapper = taskListMapper;
    }

    @GetMapping
    public List<TaskListDTO> listTaskLists(){
        return taskListService.listTaskLists().stream()
                .map(taskListMapper::toDTO)
                .toList();
    }

    @PostMapping
    public TaskListDTO createTaskList(@RequestBody TaskListDTO taskListDTO){
        TaskList createdTaskList = taskListService.createTaskList(
                taskListMapper.fromDTO(taskListDTO)
        );

        return taskListMapper.toDTO(createdTaskList);
    }
}
