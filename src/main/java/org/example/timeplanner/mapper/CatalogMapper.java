package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CatalogMapper {
    int insertCatalog(String name);
    int updateCatalog(int id, String name);
    int deleteCatalog(int id);
    int insertCatalogRelation(int ancestor, int descendant);
    int insertTaskPath(int taskId, int catalogId);
}
