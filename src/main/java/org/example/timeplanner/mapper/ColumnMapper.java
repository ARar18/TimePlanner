package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.timeplanner.pojo.entity.Column;

import java.util.List;

@Mapper
public interface ColumnMapper {
    public List<Column> getAll();
    public Column getById(int id);
    public int insert(String name, String description);
    public int update(int id, String name, String description);
    public int delete(int id);
    int addTaskToColumn(int taskId, int columnId);
}
