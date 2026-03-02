package com.nexxus.cos.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nexxus.cos.service.entity.DocumentFolderEntity;
import com.nexxus.cos.service.mapper.DocumentFolderMapper;
import com.nexxus.cos.service.service.DocumentFolderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentFolderServiceImpl extends ServiceImpl<DocumentFolderMapper, DocumentFolderEntity> implements DocumentFolderService {
}
