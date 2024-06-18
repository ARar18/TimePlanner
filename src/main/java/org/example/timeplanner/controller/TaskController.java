package org.example.timeplanner.controller;

import org.example.timeplanner.pojo.entity.Task;
import org.example.timeplanner.pojo.entity.TimeBox;
import org.example.timeplanner.service.TaskServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskServiceI taskService;

    @PostMapping("/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PostMapping("/createTimeBoxForTask")
    public Task createTimeBoxForTask(@RequestParam int taskId, @RequestBody TimeBox timeBox) {
        return taskService.createTimeBoxForTask(taskId, timeBox);
    }

    @PostMapping("/createSubTask")
    public List<Task> createSubTask(@RequestParam int parentTaskId, @RequestBody List<Task> subtasks) {
        return taskService.createSubTask(parentTaskId, subtasks);
    }

    @PostMapping("/finishTask")
    public Boolean finishTask(@RequestParam int taskId) {
        return taskService.finishTask(taskId);
    }

    @PostMapping("/recreateTask")
    public Boolean alterTask(@RequestParam int taskId) {
        return taskService.alterTask(taskId);
    }
}
