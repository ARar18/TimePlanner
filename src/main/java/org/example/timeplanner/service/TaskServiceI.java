package org.example.timeplanner.service;

import org.example.timeplanner.pojo.entity.Task;
import org.example.timeplanner.pojo.entity.TimeBox;

import java.util.List;

public interface TaskServiceI {

    Task createTask(Task task);

    Task createTimeBoxForTask(int taskId, TimeBox timeBox);

    List<Task> createSubTask(int parentTaskId, List<Task> subtasks);

    Boolean finishTask(int taskId);

    Boolean alterTask(int taskId);

    List<Task> listTasks(String sortBy, String label);

    List<Task> tasksByColumn(String sortBy);

    List<Task> tasksByTimeboxStatus(String status);

    List<Task> tasksByTimebox();
}