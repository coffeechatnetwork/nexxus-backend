package com.nexxus.cos.service.api.converter;

import com.nexxus.cos.api.dto.document.FolderDto;
import com.nexxus.cos.service.entity.DocumentFolderEntity;
import com.nexxus.cos.service.service.DocumentFileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DocumentConverter {

    private final DocumentFileService documentFileService;

    public FolderDto toFolderDto(DocumentFolderEntity entity) {
        Long fileCount = documentFileService.countFilesByFolderName(entity.getProjectId(), entity.getName());
        return FolderDto.builder()
                .projectId(entity.getProjectId())
                .name(entity.getName())
                .fileCount(fileCount)
                .build();
    }
}
