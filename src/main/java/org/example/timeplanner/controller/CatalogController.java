package org.example.timeplanner.controller;

import org.example.timeplanner.pojo.entity.Catalog;
import org.example.timeplanner.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @PostMapping("/create")
    public Catalog createCatalog(@RequestParam String name) {
        return catalogService.createCatalog(name);
    }

    @PutMapping("/update/{id}")
    public Catalog updateCatalog(@PathVariable int id, @RequestParam String name) {
        return catalogService.updateCatalog(id, name);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCatalog(@PathVariable int id) {
        return catalogService.deleteCatalog(id);
    }

    @PostMapping("/{parentCatalogId}/addChild/{childCatalogId}")
    public void addCatalogToCatalog(@PathVariable int parentCatalogId, @PathVariable int childCatalogId) {
        catalogService.addCatalogToCatalog(parentCatalogId, childCatalogId);
    }

    @PostMapping("/{catalogId}/addTask/{taskId}")
    public void addTaskToCatalog(@PathVariable int catalogId, @PathVariable int taskId) {
        catalogService.addTaskToCatalog(taskId, catalogId);
    }
}
