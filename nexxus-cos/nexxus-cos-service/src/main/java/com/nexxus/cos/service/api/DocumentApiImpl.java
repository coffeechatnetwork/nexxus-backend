package com.nexxus.cos.service.api;

import com.nexxus.common.AccountInfo;
import com.nexxus.common.AccountInfoContext;
import com.nexxus.common.ErrorDefEnum;
import com.nexxus.common.NexxusException;
import com.nexxus.cos.api.DocumentApi;
import com.nexxus.cos.api.dto.document.CreateFolderRequest;
import com.nexxus.cos.api.dto.document.FolderDto;
import com.nexxus.cos.service.api.converter.DocumentConverter;
import com.nexxus.cos.service.entity.DocumentFolderEntity;
import com.nexxus.cos.service.service.DocumentFolderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DocumentApiImpl implements DocumentApi {

    private final DocumentFolderService documentFolderService;
    private final DocumentConverter documentConverter;

    @Override
    public FolderDto createFolder(CreateFolderRequest req) {
        AccountInfo accountInfo = AccountInfoContext.get();
        DocumentFolderEntity folderEntity = documentFolderService.getByProjectIdAndName(
                req.getProjectId(), req.getName());
        if (folderEntity != null) {
            throw new NexxusException(ErrorDefEnum.RESOURCE_CONFLICT.desc("folder already exist"));
        }
        DocumentFolderEntity newFolder = DocumentFolderEntity.builder()
                .orgId(accountInfo.getOrgId())
                .projectId(req.getProjectId())
                .name(req.getName())
                .build();
        documentFolderService.save(newFolder);
        return documentConverter.toFolderDto(newFolder);
    }
}
