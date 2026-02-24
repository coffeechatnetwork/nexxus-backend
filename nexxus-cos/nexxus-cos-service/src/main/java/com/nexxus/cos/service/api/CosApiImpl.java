package com.nexxus.cos.service.api;

import com.nexxus.auth.api.OrgApi;
import com.nexxus.auth.api.dto.OrganizationDto;
import com.nexxus.common.*;
import com.nexxus.common.enums.cos.project.ProjectStatus;
import com.nexxus.cos.api.CosApi;
import com.nexxus.cos.api.dto.CreateProjectRequest;
import com.nexxus.cos.api.dto.ProjectDto;
import com.nexxus.cos.api.dto.ProjectListItem;
import com.nexxus.cos.service.entity.ProjectEntity;
import com.nexxus.cos.service.service.ProjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class CosApiImpl implements CosApi {
    private final ProjectService projectService;
    private final OrgApi orgApi;

    @Override
    public ProjectDto createProject(CreateProjectRequest req) {
        AccountInfo accountInfo = AccountInfoContext.get();
        // check org
        Long orgId = accountInfo.getOrgId();
        OrganizationDto organizationDto = orgApi.getOrganizationById(orgId);
        if (organizationDto == null) {
            throw new NexxusException(ErrorDefEnum.NOT_FOUND_EXCEPTION.desc("organization not found"));
        }
        // check project
        String name = req.getName();
        ProjectEntity projectEntity = projectService.getByName(name);
        if (projectEntity != null) {
            throw new NexxusException(ErrorDefEnum.RESOURCE_CONFLICT.desc("project already exist"));
        }

        String displayId = UUID.randomUUID().toString();
        ProjectEntity newProject = ProjectEntity.builder()
                .displayId(displayId)
                .orgId(orgId)
                .name(name)
                .slug(req.getSlug())
                .logoUrl(req.getLogoUrl())
                .status(ProjectStatus.ACTIVE)
                .build();
        projectService.save(newProject);

        return ProjectDto.builder()
                .displayId(newProject.getDisplayId())
                .orgId(newProject.getOrgId())
                .name(newProject.getName())
                .slug(newProject.getSlug())
                .logoUrl(newProject.getLogoUrl())
                .status(newProject.getStatus())
                .build();
    }

    @Override
    public PageResult<ProjectListItem> listProject(Long page, Long pageSize) {
        return null;
    }
}
