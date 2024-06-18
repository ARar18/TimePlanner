package org.example.timeplanner.controller;

import org.example.timeplanner.pojo.entity.Label;
import org.example.timeplanner.service.LabelServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/labels")
public class LabelController {

    @Autowired
    private LabelServiceI labelService;

    @PostMapping("/create")
    public Label createLabel(@RequestBody Label label) {
        return labelService.createLabel(label);
    }

    @PutMapping("/update/{id}")
    public Label updateLabel(@PathVariable int id, @RequestBody Label label) {
        label.setId(id);
        return labelService.updateLabel(label);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteLabel(@PathVariable int id) {
        return labelService.deleteLabelById(id);
    }
}