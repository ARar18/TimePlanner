package org.example.timeplanner.service;

import org.example.timeplanner.mapper.TaskMapper;
import org.example.timeplanner.mapper.TaskRelationMapper;
import org.example.timeplanner.mapper.TimeBoxMapper;
import org.example.timeplanner.mapper.TimeGivingMapper;
import org.example.timeplanner.pojo.entity.Task;
import org.example.timeplanner.pojo.entity.TaskRelation;
import org.example.timeplanner.pojo.entity.TimeBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskServiceI{

    @Autowired
    private TaskMapper taskMapper;
    @Autowired
    private TimeBoxMapper timeBoxMapper;
    @Autowired
    private TimeGivingMapper timeGivingMapper;
    @Autowired
    private TaskRelationMapper taskRelationMapper;

    @Override
    public Task createTask(Task task) {
        taskMapper.addTask(task);
        taskMapper.initTask(task);
        return task;
    }

    @Override
    public Task createTimeBoxForTask(int taskId, TimeBox timeBox) {
        timeBoxMapper.insert(timeBox);
        timeGivingMapper.TimeGiving(taskId, timeBox.getId());
        return taskMapper.getById(taskId);
    }

    @Override
    public List<Task> createSubTask(int parentTaskId, List<Task> subtasks) {
        for (Task task : subtasks) {
            createTask(task);
            taskMapper.bindSubTask(parentTaskId, task.getId(), 1);
            List<TaskRelation> ancestors = taskRelationMapper.getAncestors(task.getId());
            for (TaskRelation ancestor : ancestors) {
                taskMapper.bindSubTask(ancestor.getAncestor(), parentTaskId, 1 + ancestor.getDepth());
            }
        }
        return subtasks;
    }

    @Override
    public Boolean finishTask(int taskId) {
        return null;
    }

    @Override
    public Boolean alterTask(int taskId) {
        return null;
    }

    @Override
    public List<Task> listTasks(String sortBy, String label) {
        // 实现根据排序和标签筛选任务的逻辑
        return taskMapper.listTasks(sortBy, label);
    }

    @Override
    public List<Task> tasksByColumn(String sortBy) {
        // 实现根据列排序任务的逻辑
        return taskMapper.tasksByColumn(sortBy);
    }

    @Override
    public List<Task> tasksByTimeboxStatus(String status) {
        // 实现根据时间框状态筛选任务的逻辑
        return taskMapper.tasksByTimeboxStatus(status);
    }

    @Override
    public List<Task> tasksByTimebox() {
        // 实现根据时间框分配任务的逻辑
        return taskMapper.tasksByTimebox();
    }
}
