package io.github.ibuildthecloud.dstack.engine.manager.impl;

import java.util.List;


public interface ProcessRecordDao {

    ProcessRecord insert(ProcessRecord record);

    void update(ProcessRecord record);

    List<Long> pendingTasks();

    ProcessRecord getRecord(Long id);

}