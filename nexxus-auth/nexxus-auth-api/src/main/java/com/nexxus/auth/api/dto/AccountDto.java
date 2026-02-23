package com.nexxus.auth.api.dto;

import com.nexxus.common.enums.auth.AccountStatus;
import com.nexxus.common.enums.auth.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto implements Serializable {
    private String displayId;
    private Long orgId;
    private AccountType type;
    private String countryCode;
    private String phoneNumber;
    private String email;
    private String externalId;
    private AccountStatus status;
}
