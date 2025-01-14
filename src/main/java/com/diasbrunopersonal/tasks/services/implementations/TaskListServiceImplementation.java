package com.diasbrunopersonal.tasks.services.implementations;

import com.diasbrunopersonal.tasks.domain.entities.TaskList;
import com.diasbrunopersonal.tasks.repositories.TaskListRepository;
import com.diasbrunopersonal.tasks.services.TaskListService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskListServiceImplementation implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImplementation(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }

    @Override
    public TaskList createTaskList(TaskList taskList) {
        if (taskList.getId() != null){
            throw new IllegalArgumentException("TaskList already has ID");
        }
        if(taskList.getTitle() == null || taskList.getTitle().isBlank()){
            throw new IllegalArgumentException("TaskList needs to have a title");
        }

        LocalDateTime now = LocalDateTime.now();
        return taskListRepository.save(new TaskList(
                null,
                taskList.getTitle(),
                taskList.getDescription(),
                null,
                now,
                now
        ));

    }
}
