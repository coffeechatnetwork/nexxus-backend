package com.nexxus.server.controller.v1;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.KeyDateApi;
import com.nexxus.cos.api.dto.keydate.CreateKeyDateRequest;
import com.nexxus.cos.api.dto.keydate.EditKeyDateRequest;
import com.nexxus.cos.api.dto.keydate.KeyDateDto;
import com.nexxus.cos.api.dto.keydate.KeyDateListItem;
import com.nexxus.cos.api.dto.keydate.ListKeyDateRequest;
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
@RequestMapping("/v1/key-dates")
@RequiredArgsConstructor
public class KeyDateController {

    private final KeyDateApi keyDateApi;

    @PostMapping("")
    public KeyDateDto createKeyDate(@RequestBody @Valid CreateKeyDateRequest req) {
        return keyDateApi.createKeyDate(req);
    }

    @GetMapping("/{displayId}")
    public KeyDateDto detail(@PathVariable String displayId) {
        return keyDateApi.getByDisplayId(displayId);
    }

    @PostMapping("/{displayId}/edit")
    public KeyDateDto edit(@PathVariable String displayId, @RequestBody @Valid EditKeyDateRequest req) {
        return keyDateApi.edit(displayId, req);
    }

    @PostMapping("/list")
    public PageResult<KeyDateListItem> list(@RequestBody @Valid ListKeyDateRequest req) {
        return keyDateApi.list(req.getProjectId(), req.getPage(), req.getPageSize(),
                req.getStartDate(), req.getEndDate());
    }
}
