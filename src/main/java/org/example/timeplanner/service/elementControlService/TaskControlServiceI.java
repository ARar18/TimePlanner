package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.pojo.entity.Task;

import java.util.List;

public interface TaskControlServiceI {
    List<Task> getAllTasks();
    Task getTaskById(int id);
    List<Task> getSubTasks(int id);
    List<Task> getTasksByLabel(int labelId);
    List<Task> getTasksByColumn(int columnId);
    Task getTaskByTimeBox(int timeBoxId);
    boolean addTask(String name, String description, boolean isComplete);
    boolean updateTask(int id, String name, String description, boolean isComplete);
    boolean deleteTask(int id);
}