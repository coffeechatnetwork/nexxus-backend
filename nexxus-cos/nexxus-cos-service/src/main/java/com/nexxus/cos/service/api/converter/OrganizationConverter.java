package com.nexxus.cos.service.api.converter;

import com.nexxus.cos.api.dto.organization.OrganizationDto;
import com.nexxus.cos.service.entity.OrganizationEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrganizationConverter {

    public OrganizationDto toOrganizationDto(OrganizationEntity entity) {
        return OrganizationDto.builder()
                .displayId(entity.getDisplayId())
                .name(entity.getName())
                .code(entity.getCode())
                .status(entity.getStatus())
                .build();
    }
}
