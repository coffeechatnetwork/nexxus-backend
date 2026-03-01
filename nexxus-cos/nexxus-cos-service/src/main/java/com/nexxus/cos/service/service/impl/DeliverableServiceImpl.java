package com.nexxus.cos.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nexxus.cos.service.entity.DeliverableEntity;
import com.nexxus.cos.service.mapper.DeliverableMapper;
import com.nexxus.cos.service.service.DeliverableService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DeliverableServiceImpl extends ServiceImpl<DeliverableMapper, DeliverableEntity> implements DeliverableService {

    private final DeliverableMapper deliverableMapper;

    @Override
    public DeliverableEntity getByTitle(String title) {
        return lambdaQuery()
                .eq(DeliverableEntity::getTitle, title)
                .one();
    }

    @Override
    public DeliverableEntity getByDisplayId(String displayId) {
        return lambdaQuery()
                .eq(DeliverableEntity::getDisplayId, displayId)
                .one();
    }

    @Override
    public Page<DeliverableEntity> listDeliverables(Long page, Long pageSize) {
        Page<DeliverableEntity> pageParam = new Page<>(page, pageSize);
        LambdaQueryWrapper<DeliverableEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(DeliverableEntity::getId);
        return deliverableMapper.selectPage(pageParam, queryWrapper);
    }
}
