package org.pcloud.item;

import lombok.NonNull;
import lombok.Value;

@Value
public class ItemInformation {
    @NonNull
    ItemId itemId;

    @NonNull
    ItemName itemName;
}
