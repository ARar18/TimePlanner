package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.mapper.LabelMapper;
import org.example.timeplanner.pojo.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelControlServiceImpl implements LabelControlServiceI {

    @Autowired
    private LabelMapper labelMapper;

    @Override
    public List<Label> getAllLabels() {
        return labelMapper.getAll();
    }

    @Override
    public Label getLabelById(int id) {
        return labelMapper.getById(id);
    }

    @Override
    public List<Label> getLabelsByTask(int taskId) {
        return labelMapper.getByTask(taskId);
    }

    @Override
    public int addLabel(String name, String color, String description) {
        return labelMapper.insert(name, color, description);
    }

    @Override
    public int updateLabel(int id, String name, String color, String description) {
        return labelMapper.update(id, name, color, description);
    }

    @Override
    public int deleteLabel(int id) {
        return labelMapper.delete(id);
    }
}
