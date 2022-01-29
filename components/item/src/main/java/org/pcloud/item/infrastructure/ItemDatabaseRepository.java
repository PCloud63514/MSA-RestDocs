package org.pcloud.item.infrastructure;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.pcloud.item.application.FindEventItem;
import org.pcloud.item.model.EventItem;
import org.pcloud.item.model.Item;
import org.pcloud.item.model.ItemId;

import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ItemDatabaseRepository implements ItemRepository, FindEventItem {

    @Override
    public Optional<EventItem> findEventItemById(ItemId itemId) {
        return Optional.empty();
    }

    @Override
    public Optional<Item> findById(ItemId itemId) {
        return Optional.empty();
    }

    @Override
    public void save(Item item) {

    }
}
