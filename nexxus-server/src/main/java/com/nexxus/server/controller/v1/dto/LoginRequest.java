package com.nexxus.server.controller.v1.dto;

import com.nexxus.common.validations.ValidPassword;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest implements Serializable {
    private Long orgId;
    @Email
    private String email;
    @ValidPassword
    private String password;
}
