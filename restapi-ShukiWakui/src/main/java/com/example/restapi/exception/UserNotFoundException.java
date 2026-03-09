package com.example.restapi.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ユーザーが見つからない場合の例外クラス
 */
// @RestControllerAdvice
public class UserNotFoundException extends RuntimeException {

    // @ExceptionHandler(MethodArgumentNotValidException.class)
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
