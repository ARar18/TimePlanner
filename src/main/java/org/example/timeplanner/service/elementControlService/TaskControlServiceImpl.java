package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.mapper.TaskMapper;
import org.example.timeplanner.pojo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskControlServiceImpl implements TaskControlServiceI {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> getAllTasks() {
        return taskMapper.getAll();
    }

    @Override
    public Task getTaskById(int id) {
        return taskMapper.getById(id);
    }

    @Override
    public List<Task> getSubTasks(int id) {
        return taskMapper.getSubTasks(id);
    }

    @Override
    public List<Task> getTasksByLabel(int labelId) {
        return taskMapper.getTasksByLabel(labelId);
    }

    @Override
    public List<Task> getTasksByColumn(int columnId) {
        return taskMapper.getTasksByColumn(columnId);
    }

    @Override
    public Task getTaskByTimeBox(int timeBoxId) {
        return taskMapper.getByTimeBox(timeBoxId);
    }

    @Override
    public boolean addTask(String name, String description, boolean isComplete) {
        return taskMapper.addTask(name, description, isComplete);
    }

    @Override
    public boolean updateTask(int id, String name, String description, boolean isComplete) {
        return taskMapper.updateTask(id, name, description, isComplete);
    }

    @Override
    public boolean deleteTask(int id) {
        return taskMapper.deleteTask(id);
    }
}