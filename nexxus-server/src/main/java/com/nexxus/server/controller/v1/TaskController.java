package com.nexxus.server.controller.v1;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.dto.task.CreateTaskRequest;
import com.nexxus.cos.api.dto.task.EditTaskRequest;
import com.nexxus.cos.api.dto.task.ListTaskRequest;
import com.nexxus.cos.api.dto.task.TaskDto;
import com.nexxus.cos.api.dto.task.TaskListItem;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/tasks")
public class TaskController {

    @PostMapping("")
    public TaskDto createTask(@RequestBody @Valid CreateTaskRequest req) {
        return null;
    }

    @GetMapping("/{displayId}")
    public TaskDto detail(String displayId) {
        return null;
    }

    @PostMapping("/{displayId}/edit")
    public TaskDto edit(@PathVariable String displayId, @RequestBody @Valid EditTaskRequest req) {
        return null;
    }

    @PostMapping("/list")
    public PageResult<TaskListItem> list(@RequestBody @Valid ListTaskRequest req) {
        return null;
    }
}
