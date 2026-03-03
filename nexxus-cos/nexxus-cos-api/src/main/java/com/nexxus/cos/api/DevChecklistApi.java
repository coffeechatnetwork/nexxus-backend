package com.nexxus.cos.api;

import com.nexxus.common.PageResult;
import com.nexxus.common.enums.cos.checklist.DevChecklistCategory;
import com.nexxus.cos.api.dto.checklist.CreateDevChecklistRequest;
import com.nexxus.cos.api.dto.checklist.DevChecklistDto;
import com.nexxus.cos.api.dto.checklist.DevChecklistListItem;
import com.nexxus.cos.api.dto.checklist.DevChecklistSummaryDto;
import com.nexxus.cos.api.dto.checklist.DevChecklistSummaryRequest;
import com.nexxus.cos.api.dto.checklist.EditDevChecklistRequest;

public interface DevChecklistApi {
    DevChecklistDto createDevChecklist(CreateDevChecklistRequest req);

    DevChecklistDto getByDisplayId(String displayId);

    DevChecklistDto edit(String displayId, EditDevChecklistRequest req);

    PageResult<DevChecklistListItem> listDevChecklists(Long projectId,
                                                       Long page,
                                                       Long pageSize,
                                                       DevChecklistCategory category);

    DevChecklistSummaryDto summary(DevChecklistSummaryRequest req);
}
