package com.mangojelly.backend.global.security.support;

import com.mangojelly.backend.global.security.exception.AuthException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;

import static com.mangojelly.backend.global.error.ErrorCode.ERROR_CLIENT_BY_AUTHENTICATED_MUST_BE_VALID;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    private final HandlerExceptionResolver resolver;

    public JwtAuthenticationEntryPoint(
            @Qualifier("handlerExceptionResolver") HandlerExceptionResolver resolver) {
        this.resolver = resolver;
    }

    @Override
    public void commence(
            HttpServletRequest request,
            HttpServletResponse response,
            AuthenticationException authException) {
        resolver.resolveException(
                request,
                response,
                null,
                new AuthException(ERROR_CLIENT_BY_AUTHENTICATED_MUST_BE_VALID));
    }
}