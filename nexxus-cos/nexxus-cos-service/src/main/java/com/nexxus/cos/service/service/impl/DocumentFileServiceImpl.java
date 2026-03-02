package com.nexxus.cos.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nexxus.cos.service.entity.DocumentFileEntity;
import com.nexxus.cos.service.mapper.DocumentFileMapper;
import com.nexxus.cos.service.service.DocumentFileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentFileServiceImpl extends ServiceImpl<DocumentFileMapper, DocumentFileEntity> implements DocumentFileService {
}
