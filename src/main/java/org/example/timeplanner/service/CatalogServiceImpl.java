package org.example.timeplanner.service;

import org.example.timeplanner.mapper.CatalogMapper;
import org.example.timeplanner.pojo.entity.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private CatalogMapper catalogMapper;

    @Override
    public Catalog createCatalog(String name) {
        catalogMapper.insertCatalog(name);
        return new Catalog(name);
    }

    @Override
    public Catalog updateCatalog(int id, String name) {
        catalogMapper.updateCatalog(id, name);
        return new Catalog(id, name);
    }

    @Override
    public boolean deleteCatalog(int id) {
        return catalogMapper.deleteCatalog(id) > 0;
    }

    @Override
    public void addCatalogToCatalog(int parentCatalogId, int childCatalogId) {
        catalogMapper.insertCatalogRelation(parentCatalogId, childCatalogId);
    }

    @Override
    public void addTaskToCatalog(int taskId, int catalogId) {
        catalogMapper.insertTaskPath(taskId, catalogId);
    }
}
