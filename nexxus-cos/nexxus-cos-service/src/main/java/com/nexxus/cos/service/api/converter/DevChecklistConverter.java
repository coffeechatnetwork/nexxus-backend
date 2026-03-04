package com.nexxus.cos.service.api.converter;

import com.nexxus.cos.api.dto.checklist.DevChecklistDto;
import com.nexxus.cos.service.entity.DevChecklistEntity;
import com.nexxxus.file.api.FileApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DevChecklistConverter {

    private final FileApi fileApi;

    public DevChecklistDto toDevChecklistDto(DevChecklistEntity entity) {
        return DevChecklistDto.builder()
                .orgId(entity.getOrgId())
                .projectId(entity.getProjectId())
                .displayId(entity.getDisplayId())
                .name(entity.getTitle())
                .category(entity.getCategory())
                .status(entity.getStatus())
                .waitingOn(entity.getWaitingOn())
                .attachments(fileApi.signAttachments(entity.getAttachments()))
                .build();
    }
}
