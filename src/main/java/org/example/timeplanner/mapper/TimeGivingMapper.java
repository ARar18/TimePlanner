package org.example.timeplanner.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeGivingMapper {
    public int getTaskId(int timeBoxId);
    public int getTimeBoxId(int taskId);
    public void TimeGiving(int taskId, int timeBoxId);
    public void AlterTimeGiving(int taskId, int newTimeBoxId);
}
