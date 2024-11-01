package com.galli.spring_security.service;

import com.galli.spring_security.domain.User;
import com.galli.spring_security.dto.JwtAuthenticationResponse;
import com.galli.spring_security.dto.RefreshTokenRequest;
import com.galli.spring_security.dto.SignInRequest;
import com.galli.spring_security.dto.SignUpRequest;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signIn(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
