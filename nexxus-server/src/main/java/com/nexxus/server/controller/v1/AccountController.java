package com.nexxus.server.controller.v1;

import com.nexxus.auth.api.AuthApi;
import com.nexxus.auth.api.dto.AccountDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AuthApi authApi;

    @GetMapping("/me")
    public AccountDto getMyAccount() {
        // TODO: get displayId from jwt
        String displayId = "3a28e68e-45e5-47e4-9486-34cc4d5cdf46";
        return authApi.getByDisplayId(displayId);
    }
}
