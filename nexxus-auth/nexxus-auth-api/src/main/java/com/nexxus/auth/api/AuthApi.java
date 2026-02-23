package com.nexxus.auth.api;

import com.nexxus.auth.api.dto.AuthResponse;
import com.nexxus.auth.api.dto.LoginRequest;
import com.nexxus.auth.api.dto.RegisterRequest;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.SignedJWT;

import java.text.ParseException;

public interface AuthApi {
    AuthResponse register(RegisterRequest req);

    AuthResponse login(LoginRequest req);

    SignedJWT parseAndVerifyJWT(String token) throws ParseException, JOSEException;
}
