package com.nexxus.cos.service.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nexxus.cos.service.entity.TaskEntity;

public interface TaskService extends IService<TaskEntity> {
    TaskEntity getByTitle(String title);

    TaskEntity getByDisplayId(String displayId);

    Page<TaskEntity> listTasks(Long page, Long pageSize);
}
