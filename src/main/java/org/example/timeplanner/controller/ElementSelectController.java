package org.example.timeplanner.controller;

import org.example.timeplanner.pojo.entity.Column;
import org.example.timeplanner.pojo.entity.Label;
import org.example.timeplanner.pojo.entity.Task;
import org.example.timeplanner.pojo.entity.TimeBox;
import org.example.timeplanner.service.elementControlService.ColumnControlServiceI;
import org.example.timeplanner.service.elementControlService.LabelControlServiceI;
import org.example.timeplanner.service.elementControlService.TaskControlServiceI;
import org.example.timeplanner.service.elementControlService.TimeBoxControlServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/select")
public class ElementSelectController {

    @Autowired
    private TaskControlServiceI taskControlService;

    @Autowired
    private TimeBoxControlServiceI timeBoxControlService;

    @Autowired
    private ColumnControlServiceI columnControlService;

    @Autowired
    private LabelControlServiceI labelControlService;

    // Task endpoints
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskControlService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable int id) {
        return taskControlService.getTaskById(id);
    }

    // TimeBox endpoints
    @GetMapping("/timeboxes")
    public List<TimeBox> getAllTimeBoxes() {
        return timeBoxControlService.getAllTimeBoxes();
    }

    @GetMapping("/timeboxes/{id}")
    public TimeBox getTimeBoxById(@PathVariable int id) {
        return timeBoxControlService.getTimeBoxById(id);
    }

    // Column endpoints
    @GetMapping("/columns")
    public List<Column> getAllColumns() {
        return columnControlService.getAllColumns();
    }

    @GetMapping("/columns/{id}")
    public Column getColumnById(@PathVariable int id) {
        return columnControlService.getColumnById(id);
    }

    // Label endpoints
    @GetMapping("/labels")
    public List<Label> getAllLabels() {
        return labelControlService.getAllLabels();
    }

    @GetMapping("/labels/{id}")
    public Label getLabelById(@PathVariable int id) {
        return labelControlService.getLabelById(id);
    }
}