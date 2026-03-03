package com.nexxus.server.controller.v1;

import com.nexxus.cos.api.DocumentApi;
import com.nexxus.cos.api.dto.document.CreateFolderRequest;
import com.nexxus.cos.api.dto.document.DeleteFileRequest;
import com.nexxus.cos.api.dto.document.DeleteFolderRequest;
import com.nexxus.cos.api.dto.document.FileDto;
import com.nexxus.cos.api.dto.document.FolderDto;
import com.nexxus.cos.api.dto.document.FolderListItem;
import com.nexxus.cos.api.dto.document.ListFolderRequest;
import com.nexxus.cos.api.dto.document.RenameFileRequest;
import com.nexxus.cos.api.dto.document.RenameFolderRequest;
import com.nexxus.cos.api.dto.document.UploadToFolderResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/documents")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentApi documentApi;

    @PostMapping("/folders")
    public FolderDto createFolder(@RequestBody @Valid CreateFolderRequest req) {
        log.info("create folder req: {}", req);
        return documentApi.createFolder(req);
    }

    @PostMapping("/folders/list")
    public List<FolderListItem> listFolders(@RequestBody @Valid ListFolderRequest req) {
        return null;
    }

    @PostMapping(value = "/folders/upload", consumes = "multipart/form-data")
    public UploadToFolderResponse uploadToFolder(@RequestParam("file") MultipartFile file,
                                                 @RequestParam(value = "folderName") String folderName) throws IOException {
        return null;
    }

    @PostMapping("/folders/rename")
    public FolderDto renameFolder(@RequestBody @Valid RenameFolderRequest req) {
        return null;
    }

    @PostMapping("/folders/delete")
    public Boolean deleteFolder(@RequestBody @Valid DeleteFolderRequest req) {
        return null;
    }

    @PostMapping("/files/rename")
    public FileDto renameFile(@RequestBody @Valid RenameFileRequest req) {
        return null;
    }

    @PostMapping("/files/delete")
    public Boolean deleteFile(@RequestBody @Valid DeleteFileRequest req) {
        return null;
    }
}
