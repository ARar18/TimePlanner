package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.mapper.TimeBoxMapper;
import org.example.timeplanner.pojo.entity.TimeBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TimeBoxControlServiceImpl implements TimeBoxControlServiceI {

    @Autowired
    private TimeBoxMapper timeBoxMapper;

    @Override
    public List<TimeBox> getAllTimeBoxes() {
        return timeBoxMapper.getAll();
    }

    @Override
    public TimeBox getTimeBoxById(int id) {
        return timeBoxMapper.getById(id);
    }

    @Override
    public TimeBox getTimeBoxByTask(int taskId) {
        return timeBoxMapper.getByTask(taskId);
    }

    @Override
    public boolean addTimeBox(LocalDateTime startTime, LocalDateTime endTime) {
        return timeBoxMapper.insert(startTime, endTime);
    }

    @Override
    public boolean updateTimeBox(int id, LocalDateTime startTime, LocalDateTime endTime) {
        return timeBoxMapper.update(id, startTime, endTime);
    }

    @Override
    public boolean deleteTimeBox(int id) {
        return timeBoxMapper.delete(id);
    }
}