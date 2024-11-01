package com.galli.spring_security.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class RefreshTokenRequest {

    private String token;

}
