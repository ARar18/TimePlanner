package org.example.timeplanner.service;

import org.example.timeplanner.pojo.entity.Label;
import org.example.timeplanner.mapper.LabelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LabelServiceImpl implements LabelServiceI {

    @Autowired
    private LabelMapper labelMapper;

    @Override
    @Transactional
    public Label createLabel(Label label) {
        labelMapper.insert(label.getName(), label.getColor(), label.getDescription());
        return label;
    }

    @Override
    @Transactional
    public Label updateLabel(Label label) {
        labelMapper.update(label.getId(), label.getName(), label.getColor(), label.getDescription());
        return label;
    }

    @Override
    @Transactional
    public boolean deleteLabelById(int id) {
        return labelMapper.delete(id) > 0;
    }
}