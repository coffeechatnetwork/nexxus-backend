package com.nexxus.cos.api.dto.document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteFileRequest {
    @NotNull
    private Long projectId;
    @NotBlank
    @Size(max = 64)
    private String folderName;
    @NotBlank
    @Size(max = 64)
    private String fileName;
}
