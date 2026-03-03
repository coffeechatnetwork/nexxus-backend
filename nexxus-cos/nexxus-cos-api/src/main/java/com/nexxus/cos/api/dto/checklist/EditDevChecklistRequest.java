package com.nexxus.cos.api.dto.checklist;

import com.nexxus.common.enums.cos.checklist.DevChecklistStatus;
import com.nexxus.common.vo.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class EditDevChecklistRequest implements Serializable {
    private DevChecklistStatus status;
    private List<Attachment> attachments;
}
