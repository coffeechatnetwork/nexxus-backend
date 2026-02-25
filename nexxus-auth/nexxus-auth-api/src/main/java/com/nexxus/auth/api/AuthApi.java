package com.nexxus.auth.api;

import com.nexxus.auth.api.dto.AuthLoginRequest;
import com.nexxus.auth.api.dto.AuthRegisterRequest;
import com.nexxus.auth.api.dto.AuthResponse;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.SignedJWT;

import java.text.ParseException;

public interface AuthApi {
    AuthResponse register(AuthRegisterRequest req);

    AuthResponse login(AuthLoginRequest req);

    SignedJWT parseAndVerifyJWT(String token) throws ParseException, JOSEException;
}
