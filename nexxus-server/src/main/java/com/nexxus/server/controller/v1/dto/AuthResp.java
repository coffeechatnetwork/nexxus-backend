package com.nexxus.server.controller.v1.dto;

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
public class AuthResp implements Serializable {
    private String token;

    @Builder.Default
    private String tokenType = "Bearer";

    private Long expiresInSeconds;

    private UUID accountId;
}
