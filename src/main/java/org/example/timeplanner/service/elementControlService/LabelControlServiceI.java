package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.pojo.entity.Label;

import java.util.List;

public interface LabelControlServiceI {
    List<Label> getAllLabels();
    Label getLabelById(int id);
    List<Label> getLabelsByTask(int taskId);
    int addLabel(String name, String color, String description);
    int updateLabel(int id, String name, String color, String description);
    int deleteLabel(int id);
}
