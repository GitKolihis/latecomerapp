package com.gitkolihis.latecomerapp.response;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ApiMessage {

    private String code;
    private String message;
    private Timestamp time;
    private Object Result;

    public ApiMessage(String code, String message, Timestamp time, Object result) {
        this.code = code;
        this.message = message;
        this.time = time;
        Result = result;
    }
}
