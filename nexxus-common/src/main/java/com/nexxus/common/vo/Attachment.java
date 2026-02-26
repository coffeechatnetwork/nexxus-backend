package com.nexxus.common.vo;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.URL;

import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Attachment implements Serializable {
    @Size(max = 64)
    private String name;
    @URL
    @Size(min = 1, max = 2048)
    private String url;
}
