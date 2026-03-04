package com.nexxus.cos.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nexxus.cos.service.entity.DevChecklistEntity;

public interface DevChecklistService extends IService<DevChecklistEntity> {
    DevChecklistEntity getByProjectIdAndTitle(Long projectId, String title);

    DevChecklistEntity getByDisplayId(String displayId);
}
