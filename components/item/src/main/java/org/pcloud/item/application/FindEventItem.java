package org.pcloud.item.application;

import org.pcloud.item.model.EventItem;
import org.pcloud.item.model.ItemId;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface FindEventItem {
    Optional<EventItem> findEventItemById(ItemId itemId);
}
