package org.pcloud.item;

import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
public class ItemId {
    @NonNull
    UUID itemId;
}
