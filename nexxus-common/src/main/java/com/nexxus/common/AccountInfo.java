package com.nexxus.common;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@SuperBuilder
@Data
public class AccountInfo implements Serializable {
    private UUID accountId;
    private String email;
    private Long orgId;
}
