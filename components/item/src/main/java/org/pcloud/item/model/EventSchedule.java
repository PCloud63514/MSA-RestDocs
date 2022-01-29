package org.pcloud.item.model;

import lombok.NonNull;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class EventSchedule {
    @NonNull
    LocalDateTime eventStartAt;

    @NonNull
    LocalDateTime eventEndAt;
}
