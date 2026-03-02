package com.nexxus.cos.service.api;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.TaskApi;
import com.nexxus.cos.api.dto.task.CreateTaskRequest;
import com.nexxus.cos.api.dto.task.EditTaskRequest;
import com.nexxus.cos.api.dto.task.TaskDto;
import com.nexxus.cos.api.dto.task.TaskListItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TaskApiImpl implements TaskApi {
    @Override
    public TaskDto createTask(CreateTaskRequest req) {
        return null;
    }

    @Override
    public TaskDto getByDisplayId(String displayId) {
        return null;
    }

    @Override
    public TaskDto edit(String displayId, EditTaskRequest req) {
        return null;
    }

    @Override
    public PageResult<TaskListItem> listTasks(Long page, Long pageSize) {
        return null;
    }
}
