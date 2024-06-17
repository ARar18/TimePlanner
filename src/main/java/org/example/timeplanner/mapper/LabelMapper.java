package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.timeplanner.pojo.entity.Label;

import java.util.List;

@Mapper
public interface LabelMapper {
    public List<Label> getAll();
    public Label getById(int id);
    public List<Label> getByTask(int taskId);

    public int insert(String name, String color, String description);
    public int update(int id, String name, String color, String description);
    public int delete(int id);
}
