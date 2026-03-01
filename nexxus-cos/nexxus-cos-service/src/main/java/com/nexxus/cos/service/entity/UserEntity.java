package com.nexxus.cos.service.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.nexxus.common.BaseEntity;
import com.nexxus.common.enums.cos.user.UserStatus;
import com.nexxus.common.handlers.UuidTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.apache.ibatis.type.JdbcType;

import java.util.UUID;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cos_user", autoResultMap = true)
public class UserEntity extends BaseEntity {
    @TableField(typeHandler = UuidTypeHandler.class, jdbcType = JdbcType.VARCHAR)
    private UUID accountId;
    private Long orgId;
    private String email;
    private String firstName;
    private String lastName;
    private String username;
    private String avatarUrl;
    private UserStatus status;
}
