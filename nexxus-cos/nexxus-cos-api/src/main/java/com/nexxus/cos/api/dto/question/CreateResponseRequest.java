package com.nexxus.cos.api.dto.question;

import com.nexxus.common.enums.cos.question.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CreateResponseRequest implements Serializable {
    private String content;
    private ResponseStatus status;
}
