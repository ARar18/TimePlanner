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
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/insert")
public class ElementInsertController {

    @Autowired
    private TaskControlServiceI taskControlService;

    @Autowired
    private TimeBoxControlServiceI timeBoxControlService;

    @Autowired
    private ColumnControlServiceI columnControlService;

    @Autowired
    private LabelControlServiceI labelControlService;

    @PostMapping("/task")
    public boolean addTask(@RequestParam String name, @RequestParam String description, @RequestParam boolean isCompleted) {
        return taskControlService.addTask(name, description, isCompleted);
    }

    @PostMapping("/timebox")
    public boolean addTimeBox(@RequestParam LocalDateTime startTime, @RequestParam LocalDateTime endTime) {
        return timeBoxControlService.addTimeBox(startTime, endTime);
    }

    @PostMapping("/column")
    public int addColumn(@RequestParam String name, @RequestParam String description) {
        return columnControlService.addColumn(name, description);
    }

    @PostMapping("/label")
    public int addLabel(@RequestParam String name, @RequestParam String color, @RequestParam String description) {
        return labelControlService.addLabel(name, color, description);
    }
}