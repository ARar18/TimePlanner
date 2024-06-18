package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.timeplanner.pojo.entity.Task;

import java.util.List;

@Mapper
public interface TaskMapper {
    public List<Task> getAll();
    public Task getById(int id);
    public List<Task> getTasksByLabel(int labelId);
    public List<Task> getTasksByColumn(int ColumnId);
    public Task getByTimeBox(int timeBoxId);
    public void addTask(Task task);
    public void initTask(Task task);
    public void bindSubTask(int parentTaskId, int childTaskId, int depth);
    public boolean updateTask(int id, String name, String description, boolean is_complete);
    public boolean deleteTask(int id);

    public List<Task> getSubTasks(int taskId);
    public Task getParentTask(int taskId);

    List<Task> listTasks(String sortBy, String label);
    List<Task> tasksByColumn(String sortBy);
    List<Task> tasksByTimeboxStatus(String status);
    List<Task> tasksByTimebox();
}
