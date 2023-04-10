package com.example.cloud_storage_finel.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationRS {

    @JsonProperty("auth-token")
    private String authToken;
}
