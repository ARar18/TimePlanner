package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.timeplanner.pojo.entity.Task;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface TaskMapper {
    public List<Task> getAll();
    public Task getById(int id);
    public List<Task> getSubTasks(int id);
    public List<Task> getTasksByLabel(int labelId);
    public List<Task> getTasksByColumn(int ColumnId);
    public Task getByTimeBox(int timeBoxId);

    public boolean addTask(String name, String description, boolean is_complete);
    public boolean updateTask(int id, String name, String description, boolean is_complete);
    public boolean deleteTask(int id);
}
