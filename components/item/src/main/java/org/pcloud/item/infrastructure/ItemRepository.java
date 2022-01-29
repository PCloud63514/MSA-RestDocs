package org.pcloud.item.infrastructure;

import org.pcloud.item.model.Item;
import org.pcloud.item.model.ItemId;

import java.util.Optional;

public interface ItemRepository {
    Optional<Item> findById(ItemId itemId);

    void save(Item item);
}
