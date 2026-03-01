package com.nexxus.cos.api;

import com.nexxus.cos.api.dto.deliverable.CreateDeliverableRequest;
import com.nexxus.cos.api.dto.deliverable.DeliverableDto;

public interface DeliverableApi {
    DeliverableDto createDeliverable(CreateDeliverableRequest req);

    DeliverableDto getByDisplayId(String displayId);
}
