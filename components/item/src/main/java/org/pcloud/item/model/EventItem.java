package org.pcloud.item.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;

@Value
@AllArgsConstructor
@EqualsAndHashCode(of = "itemInformation")
public class EventItem implements Item {
    @NonNull
    ItemInformation itemInformation;

    @NonNull
    EventSchedule eventSchedule;

    public EventItem(ItemId itemId, ItemName itemName, EventSchedule eventSchedule) {
        this(new ItemInformation(itemId, itemName), eventSchedule);
    }
}
