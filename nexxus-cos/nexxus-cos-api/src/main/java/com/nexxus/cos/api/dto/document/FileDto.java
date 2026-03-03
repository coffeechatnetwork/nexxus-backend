package com.nexxus.cos.api.dto.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FileDto implements Serializable {
    private Long projectId;
    private String folderName;
    private String name;
    private String docUrl;
}
