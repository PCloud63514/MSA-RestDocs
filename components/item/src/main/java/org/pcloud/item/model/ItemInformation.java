package org.pcloud.item.model;

import lombok.NonNull;
import lombok.Value;

@Value
public class ItemInformation {
    @NonNull
    ItemId itemId;

    @NonNull
    ItemName itemName;
}
