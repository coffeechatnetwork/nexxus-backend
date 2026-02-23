package com.nexxus.auth.service.api;

import com.nexxus.auth.api.AccountApi;
import com.nexxus.auth.api.dto.AccountDto;
import com.nexxus.auth.service.entity.AccountEntity;
import com.nexxus.auth.service.service.AccountService;
import com.nexxus.common.ErrorDefEnum;
import com.nexxus.common.NexxusException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountApiImpl implements AccountApi {
    private final AccountService accountService;

    @Override
    public AccountDto getByDisplayId(String displayId) {
        AccountEntity accountEntity = accountService.getByDisplayId(displayId);
        if (accountEntity == null) {
            throw new NexxusException(ErrorDefEnum.NOT_FOUND_EXCEPTION.desc("account not found"));
        }

        return AccountDto.builder()
                .displayId(accountEntity.getDisplayId())
                .orgId(accountEntity.getOrgId())
                .type(accountEntity.getType())
                .countryCode(accountEntity.getCountryCode())
                .phoneNumber(accountEntity.getPhoneNumber())
                .email(accountEntity.getEmail())
                .externalId(accountEntity.getExternalId())
                .status(accountEntity.getStatus())
                .build();
    }
}
