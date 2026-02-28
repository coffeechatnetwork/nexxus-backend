package com.nexxus.cos.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nexxus.common.BaseEntity;
import com.nexxus.common.enums.cos.deliverable.DeliverableStatus;
import com.nexxus.common.vo.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("cos_deliverable")
public class DeliverableEntity extends BaseEntity {
    private String displayId;
    private String title;
    private String shortDesc;
    private String longDesc;
    private UUID assignee;
    private List<UUID> participants;
    private Instant deadline;
    private DeliverableStatus status;
    private List<Attachment> attachments;
}
