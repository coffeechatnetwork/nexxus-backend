package com.nexxus.cos.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nexxus.cos.service.entity.DevChecklistEntity;
import com.nexxus.cos.service.mapper.DevChecklistMapper;
import com.nexxus.cos.service.service.DevChecklistService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DevChecklistServiceImpl extends ServiceImpl<DevChecklistMapper, DevChecklistEntity> implements DevChecklistService {
}
