package org.pcloud.item.infrastructure;

import lombok.Data;
import org.pcloud.item.model.*;

import java.time.LocalDateTime;
import java.util.UUID;

import static io.vavr.API.*;
import static org.pcloud.item.infrastructure.ItemDatabaseEntity.ItemState.*;

@Data
public class ItemDatabaseEntity {

    enum ItemState {
        Event;
    }

    UUID itemId;
    String itemName;
    LocalDateTime eventStartAt;
    LocalDateTime eventEndAt;
    ItemState itemState;

    Item toDomainModel() {
        return Match(itemState).of(
                Case($(Event), this::toEventItem)
        );
    }

    private EventItem toEventItem() {
        return new EventItem(new ItemId(itemId), new ItemName(itemName), new EventSchedule(eventStartAt, eventEndAt));
    }
}
