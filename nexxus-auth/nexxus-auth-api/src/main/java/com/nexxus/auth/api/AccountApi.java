package com.nexxus.auth.api;

import com.nexxus.auth.api.dto.AccountDto;

public interface AccountApi {
    AccountDto getByDisplayId(String displayId);
}
