package com.nexxus.cos.service.api;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.KeyDateApi;
import com.nexxus.cos.api.dto.keydate.CreateKeyDateRequest;
import com.nexxus.cos.api.dto.keydate.EditKeyDateRequest;
import com.nexxus.cos.api.dto.keydate.KeyDateDto;
import com.nexxus.cos.api.dto.keydate.KeyDateListItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Slf4j
@Component
@RequiredArgsConstructor
public class KeyDateApiImpl implements KeyDateApi {
    @Override
    public KeyDateDto createKeyDate(CreateKeyDateRequest req) {
        return null;
    }

    @Override
    public KeyDateDto getByDisplayId(String displayId) {
        return null;
    }

    @Override
    public KeyDateDto edit(String displayId, EditKeyDateRequest req) {
        return null;
    }

    @Override
    public PageResult<KeyDateListItem> list(Long projectId, Long page, Long pageSize, Instant startDate, Instant endDate) {
        return null;
    }
}
