package com.nexxus.cos.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nexxus.cos.service.entity.DocumentEntity;
import com.nexxus.cos.service.mapper.DocumentMapper;
import com.nexxus.cos.service.service.DocumentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentServiceImpl extends ServiceImpl<DocumentMapper, DocumentEntity> implements DocumentService {
}
