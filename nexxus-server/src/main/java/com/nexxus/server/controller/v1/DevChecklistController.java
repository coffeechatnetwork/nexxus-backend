package com.nexxus.server.controller.v1;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.DevChecklistApi;
import com.nexxus.cos.api.dto.checklist.CreateDevChecklistRequest;
import com.nexxus.cos.api.dto.checklist.DevChecklistDto;
import com.nexxus.cos.api.dto.checklist.DevChecklistListItem;
import com.nexxus.cos.api.dto.checklist.DevChecklistSummaryDto;
import com.nexxus.cos.api.dto.checklist.DevChecklistSummaryRequest;
import com.nexxus.cos.api.dto.checklist.EditDevChecklistRequest;
import com.nexxus.cos.api.dto.checklist.ListDevChecklistRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/checklists")
@RequiredArgsConstructor
public class DevChecklistController {

    private final DevChecklistApi devChecklistApi;

    @PostMapping("")
    public DevChecklistDto createDevChecklist(@RequestBody @Valid CreateDevChecklistRequest req) {
        log.info("create devChecklist req: {}", req);
        return devChecklistApi.createDevChecklist(req);
    }

    @GetMapping("/{displayId}")
    public DevChecklistDto getByDisplayId(@PathVariable String displayId) {
        return devChecklistApi.getByDisplayId(displayId);
    }

    @PostMapping("/{displayId}/edit")
    public DevChecklistDto edit(@PathVariable String displayId, @RequestBody @Valid EditDevChecklistRequest req) {
        log.info("edit devChecklist req {}", req);
        return devChecklistApi.edit(displayId, req);
    }

    @PostMapping("/list")
    public PageResult<DevChecklistListItem> list(@RequestBody @Valid ListDevChecklistRequest req) {
        return devChecklistApi.listDevChecklists(req.getProjectId(), req.getPage(), req.getPageSize(), req.getCategory());
    }

    @PostMapping("/summary")
    public DevChecklistSummaryDto summary(@RequestBody @Valid DevChecklistSummaryRequest req) {
        return devChecklistApi.summary(req);
    }
}
