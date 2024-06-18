package org.example.timeplanner.service;

import org.example.timeplanner.mapper.ColumnMapper;
import org.example.timeplanner.pojo.entity.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ColumnServiceIImpl implements ColumnServiceI {
    @Autowired
    private ColumnMapper columnMapper;

    @Override
    public Column createColumn(Column column) {
        columnMapper.insert(column.getName(), column.getDescription());
        return column;
    }

    @Override
    public Column updateColumn(Column column) {
        columnMapper.update(column.getId(), column.getName(), column.getDescription());
        return column;
    }

    @Override
    public boolean deleteColumn(int id) {
        return columnMapper.delete(id) > 0;
    }

    @Override
    public List<Column> getAllColumns() {
        return columnMapper.getAll();
    }

    @Override
    public Column getColumnById(int id) {
        return columnMapper.getById(id);
    }
}