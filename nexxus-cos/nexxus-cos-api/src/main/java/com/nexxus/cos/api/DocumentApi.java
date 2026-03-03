package com.nexxus.cos.api;

import com.nexxus.cos.api.dto.document.CreateFolderRequest;
import com.nexxus.cos.api.dto.document.FolderDto;

public interface DocumentApi {
    FolderDto createFolder(CreateFolderRequest req);
}
