package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.mapper.ColumnMapper;
import org.example.timeplanner.pojo.entity.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColumnControlServiceImpl implements ColumnControlServiceI {

    @Autowired
    private ColumnMapper columnMapper;

    @Override
    public List<Column> getAllColumns() {
        return columnMapper.getAll();
    }

    @Override
    public Column getColumnById(int id) {
        return columnMapper.getById(id);
    }

    @Override
    public int addColumn(String name, String description) {
        return columnMapper.insert(name, description);
    }

    @Override
    public int updateColumn(int id, String name, String description) {
        return columnMapper.update(id, name, description);
    }

    @Override
    public int deleteColumn(int id) {
        return columnMapper.delete(id);
    }
}