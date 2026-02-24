package com.nexxus.server.controller.v1;

import com.nexxus.cos.api.CosApi;
import com.nexxus.cos.api.dto.CreateProjectRequest;
import com.nexxus.cos.api.dto.ProjectDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final CosApi cosApi;

    @PostMapping("")
    public ProjectDto createProject(@RequestBody @Valid CreateProjectRequest req) {
        return cosApi.createProject(req);
    }
}
