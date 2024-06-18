package org.example.timeplanner.service;

import org.example.timeplanner.pojo.entity.Column;
import java.util.List;

public interface ColumnServiceI {
    Column createColumn(Column column);
    Column updateColumn(Column column);
    boolean deleteColumn(int id);
    List<Column> getAllColumns();
    Column getColumnById(int id);
}