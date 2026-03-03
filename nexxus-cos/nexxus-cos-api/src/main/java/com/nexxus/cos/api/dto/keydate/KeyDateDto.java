package com.nexxus.cos.api.dto.keydate;

import com.nexxus.common.enums.cos.keydate.KeyDateCategory;
import com.nexxus.common.vo.Attachment;
import com.nexxus.cos.api.dto.user.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class KeyDateDto implements Serializable {
    private Long orgId;
    private Long projectId;
    private String title;
    private String shortDesc;
    private String longDesc;
    private KeyDateCategory category;
    private Instant referenceDate;
    private List<Attachment> attachments;
    private UserDto createdBy;
    private Instant createdAt;
    private UserDto updatedBy;
    private Instant updatedAt;
}
