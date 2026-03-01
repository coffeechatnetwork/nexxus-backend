package com.nexxus.cos.api.dto.deliverable;

import com.nexxus.common.enums.cos.deliverable.DeliverableStatus;
import com.nexxus.cos.api.dto.user.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class DeliverableListItem implements Serializable {
    private String displayId;
    private String title;
    private UserDto assignee;
    private Instant deadline;
    private Integer daysToDeadline;
    private DeliverableStatus status;
}
