package com.nexxus.auth.service.service;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jwt.SignedJWT;

import java.text.ParseException;
import java.util.List;
import java.util.UUID;

public interface JwtService {

    SignedJWT generateJWT(UUID subject, List<String> audiences, String orgId, String email) throws JOSEException;

    SignedJWT parseAndVerifyJWT(String token) throws ParseException, JOSEException;
}
