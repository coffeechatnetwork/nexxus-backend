package com.nexxus.cos.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nexxus.cos.service.entity.TaskEntity;
import com.nexxus.cos.service.mapper.TaskMapper;
import com.nexxus.cos.service.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TaskServiceImpl extends ServiceImpl<TaskMapper, TaskEntity> implements TaskService {

    private final TaskMapper taskMapper;

    @Override
    public TaskEntity getByTitle(String title) {
        return lambdaQuery().eq(TaskEntity::getTitle, title).one();
    }

    @Override
    public TaskEntity getByDisplayId(String displayId) {
        return lambdaQuery().eq(TaskEntity::getDisplayId, displayId).one();
    }

    @Override
    public Page<TaskEntity> listTasks(Long page, Long pageSize) {
        Page<TaskEntity> pageParam = new Page<>(page, pageSize);
        LambdaQueryWrapper<TaskEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(TaskEntity::getId);
        return taskMapper.selectPage(pageParam, queryWrapper);
    }
}
