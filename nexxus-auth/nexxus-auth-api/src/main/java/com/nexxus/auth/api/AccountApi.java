package com.nexxus.auth.api;

import com.nexxus.auth.api.dto.AccountDto;
import com.nexxus.common.PageResult;

import java.util.UUID;

public interface AccountApi {
    AccountDto getByDisplayId(UUID displayId);

    PageResult<AccountDto> listAccount(Long page, Long pageSize);
}
