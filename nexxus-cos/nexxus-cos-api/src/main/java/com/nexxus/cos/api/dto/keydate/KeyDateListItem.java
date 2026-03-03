package com.nexxus.cos.api.dto.keydate;

import com.nexxus.common.enums.cos.keydate.KeyDateCategory;
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
public class KeyDateListItem implements Serializable {
    private String title;
    private String shortDesc;
    private String longDesc;
    private KeyDateCategory category;
    private Instant referenceDate;
}
