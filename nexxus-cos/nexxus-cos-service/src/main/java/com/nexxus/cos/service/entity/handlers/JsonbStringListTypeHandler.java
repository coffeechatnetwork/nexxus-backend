package com.nexxus.cos.service.entity.handlers;

import com.nexxus.common.handlers.JsonbListTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@MappedJdbcTypes(JdbcType.OTHER)
public class JsonbStringListTypeHandler extends JsonbListTypeHandler<String> {
    public JsonbStringListTypeHandler() {
        super(String.class);
    }
}
