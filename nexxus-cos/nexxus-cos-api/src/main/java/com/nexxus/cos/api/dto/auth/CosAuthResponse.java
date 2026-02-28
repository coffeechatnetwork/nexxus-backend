package com.nexxus.cos.api.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CosAuthResponse implements Serializable {
    private String token;

    @Builder.Default
    private String tokenType = "Bearer";

    private Long expiresInSeconds;

    private UUID accountId;
}
