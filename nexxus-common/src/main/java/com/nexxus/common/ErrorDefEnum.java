package com.nexxus.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public enum ErrorDefEnum implements Serializable {
    INVALID_PARAM_EXCEPTION(400, "Invalid Parameter Exception"),

    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND_EXCEPTION(404, "Item Not Found"),
    RESOURCE_CONFLICT(409, "Resource Conflict"),

    COMMON_EXCEPTION(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),

    FAILED_TO_GENERATE_JWT(600, "Failed to generate JWT"),
    FAILED_TO_PARSE_JWT(601, "Failed to parse JWT"),
    ;

    private final Integer code;
    private String desc;

    public ErrorDefEnum desc(String desc) {
        this.desc = desc;
        return this;
    }
}
