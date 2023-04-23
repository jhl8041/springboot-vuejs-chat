package com.dannyjae.chatapi.common.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse<T> {

    private String code;
    private String message;
    private T data;

    @Builder
    public ApiResponse(String code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ApiResponse<T> succeed() {
        return ApiResponse.succeed(null);
    }

    public static <T> ApiResponse<T> succeed(T data) {
        return ApiResponse.succeed(null, data);
    }

    public static <T> ApiResponse<T> succeed(String message, T data) {
        return ApiResponse.<T>builder()
                .code("200")
                .message(message)
                .data(data)
                .build();
    }
}
