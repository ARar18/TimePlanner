package org.example.timeplanner.service.elementControlService;

import org.example.timeplanner.pojo.entity.TimeBox;

import java.time.LocalDateTime;
import java.util.List;

public interface TimeBoxControlServiceI {
    List<TimeBox> getAllTimeBoxes();
    TimeBox getTimeBoxById(int id);
    TimeBox getTimeBoxByTask(int taskId);
    boolean addTimeBox(LocalDateTime startTime, LocalDateTime endTime);
    boolean updateTimeBox(int id, LocalDateTime startTime, LocalDateTime endTime);
    boolean deleteTimeBox(int id);
}