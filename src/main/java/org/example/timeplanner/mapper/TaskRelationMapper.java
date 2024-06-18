package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.timeplanner.pojo.entity.Task;
import org.example.timeplanner.pojo.entity.TaskRelation;

import java.util.List;

@Mapper
public interface TaskRelationMapper {
    public List<TaskRelation> getAncestors(int taskId);
    public List<TaskRelation> getDescendants(int taskId);
}
