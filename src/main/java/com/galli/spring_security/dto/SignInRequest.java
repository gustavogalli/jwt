package com.galli.spring_security.dto;

import lombok.Data;

@Data
public class SignInRequest {

    private String email;
    private String password;
}
