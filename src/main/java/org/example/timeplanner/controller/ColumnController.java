package org.example.timeplanner.controller;

import org.example.timeplanner.pojo.entity.Column;
import org.example.timeplanner.service.ColumnServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/columns")
public class ColumnController {

    @Autowired
    private ColumnServiceI columnService;

    @PostMapping("/create")
    public Column createColumn(@RequestBody Column column) {
        return columnService.createColumn(column);
    }

    @PutMapping("/update/{id}")
    public Column updateColumn(@PathVariable int id, @RequestBody Column column) {
        column.setId(id);
        return columnService.updateColumn(column);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteColumn(@PathVariable int id) {
        return columnService.deleteColumn(id);
    }

    @GetMapping("/")
    public List<Column> getAllColumns() {
        return columnService.getAllColumns();
    }

    @GetMapping("/{id}")
    public Column getColumnById(@PathVariable int id) {
        return columnService.getColumnById(id);
    }
}