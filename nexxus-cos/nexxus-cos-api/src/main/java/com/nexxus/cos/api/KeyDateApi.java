package com.nexxus.cos.api;

import com.nexxus.common.PageResult;
import com.nexxus.cos.api.dto.keydate.CreateKeyDateRequest;
import com.nexxus.cos.api.dto.keydate.EditKeyDateRequest;
import com.nexxus.cos.api.dto.keydate.KeyDateDto;
import com.nexxus.cos.api.dto.keydate.KeyDateListItem;

import java.time.Instant;

public interface KeyDateApi {
    KeyDateDto createKeyDate(CreateKeyDateRequest req);

    KeyDateDto getByDisplayId(String displayId);

    KeyDateDto edit(String displayId, EditKeyDateRequest req);

    PageResult<KeyDateListItem> list(Long projectId, Long page, Long pageSize, Instant startDate, Instant endDate);
}
