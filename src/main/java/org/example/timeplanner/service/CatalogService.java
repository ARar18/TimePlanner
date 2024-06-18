package org.example.timeplanner.service;

import org.example.timeplanner.pojo.entity.Catalog;

public interface CatalogService {
    Catalog createCatalog(String name);
    Catalog updateCatalog(int id, String name);
    boolean deleteCatalog(int id);
    void addCatalogToCatalog(int parentCatalogId, int childCatalogId);
    void addTaskToCatalog(int taskId, int catalogId);
}