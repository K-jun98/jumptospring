package com.example.board;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason="entity not found")
public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String question_not_fount) {
        super(question_not_fount);
    }
}
