package com.nexxus.cos.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nexxus.common.BaseEntity;
import com.nexxus.common.enums.cos.checklist.DevChecklistCategory;
import com.nexxus.common.enums.cos.checklist.DevChecklistStatus;
import com.nexxus.common.vo.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("cos_dev_checklist")
public class DevChecklistEntity extends BaseEntity {
    private Long orgId;
    private Long projectId;
    private String displayId;
    private String name;
    private DevChecklistCategory category;
    private DevChecklistStatus status;
    private String waitingOn;
    private List<Attachment> attachments;
}
