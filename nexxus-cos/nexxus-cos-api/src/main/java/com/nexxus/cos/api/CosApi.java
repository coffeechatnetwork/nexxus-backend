package com.nexxus.cos.api;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.dto.CreateProjectRequest;
import com.nexxus.cos.api.dto.ProjectDto;
import com.nexxus.cos.api.dto.ProjectListItem;

public interface CosApi {
    ProjectDto createProject(CreateProjectRequest req);

    PageResult<ProjectListItem> listProject(Long page, Long pageSize);
}
