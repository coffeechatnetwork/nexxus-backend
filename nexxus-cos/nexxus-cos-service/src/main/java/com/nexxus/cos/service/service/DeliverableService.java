package com.nexxus.cos.service.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nexxus.cos.service.entity.DeliverableEntity;

public interface DeliverableService extends IService<DeliverableEntity> {
    DeliverableEntity getByTitle(String title);

    DeliverableEntity getByDisplayId(String displayId);

    Page<DeliverableEntity> listDeliverables(Long page, Long pageSize);
}
