package com.nexxus.cos.service.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.nexxus.common.BaseEntity;
import com.nexxus.common.enums.cos.checklist.DevChecklistCategory;
import com.nexxus.common.enums.cos.checklist.DevChecklistStatus;
import com.nexxus.common.vo.Attachment;
import com.nexxus.cos.service.entity.handlers.JsonbAttachmentListTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "cos_dev_checklist", autoResultMap = true)
public class DevChecklistEntity extends BaseEntity {
    private Long orgId;
    private Long projectId;
    private String displayId;
    private String title;
    private String description;
    private DevChecklistCategory category;
    private DevChecklistStatus status;
    private String waitingOn;
    @TableField(typeHandler = JsonbAttachmentListTypeHandler.class, jdbcType = JdbcType.OTHER)
    private List<Attachment> attachments;
}
