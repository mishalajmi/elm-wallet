package com.malajmi.elm_wallet.user.models;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Builder
@ResponseStatus(HttpStatus.OK)
public record LoginResponse(String username, String token) {
}
