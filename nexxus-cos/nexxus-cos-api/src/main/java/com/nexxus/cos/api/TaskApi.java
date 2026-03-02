package com.nexxus.cos.api;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.dto.task.CreateTaskRequest;
import com.nexxus.cos.api.dto.task.EditTaskRequest;
import com.nexxus.cos.api.dto.task.TaskDto;
import com.nexxus.cos.api.dto.task.TaskListItem;

public interface TaskApi {
    TaskDto createTask(CreateTaskRequest req);

    TaskDto getByDisplayId(String displayId);

    TaskDto edit(String displayId, EditTaskRequest req);

    PageResult<TaskListItem> listTasks(Long page, Long pageSize);
}
