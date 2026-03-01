package com.nexxus.cos.service.entity.handlers;

import com.nexxus.common.handlers.JsonbListTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.util.UUID;

@MappedJdbcTypes(JdbcType.OTHER)
public class JsonbUuidListTypeHandler extends JsonbListTypeHandler<UUID> {

    public JsonbUuidListTypeHandler() {
        super(UUID.class);
    }
}
