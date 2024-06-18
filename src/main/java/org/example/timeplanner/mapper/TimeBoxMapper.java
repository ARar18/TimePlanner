package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.timeplanner.pojo.entity.TimeBox;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface TimeBoxMapper {
    public List<TimeBox> getAll();
    public TimeBox getById(int id);
    public TimeBox getByTask(int TaskId);

    public boolean insert(TimeBox timeBox);
    public void update(int id, LocalDateTime startTime, LocalDateTime endTime);
    public void delete(int id);
}
