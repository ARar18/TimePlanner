package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.pojo.entity.Column;

import java.util.List;

public interface ColumnControlServiceI {
    List<Column> getAllColumns();
    Column getColumnById(int id);
    int addColumn(String name, String description);
    int updateColumn(int id, String name, String description);
    int deleteColumn(int id);
}
