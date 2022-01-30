package org.pcloud.item.infrastructure;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.pcloud.item.application.FindEventItem;
import org.pcloud.item.application.FindEventItems;
import org.pcloud.item.model.EventItem;
import org.pcloud.item.model.Item;
import org.pcloud.item.model.ItemId;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ItemDatabaseRepository implements ItemRepository, FindEventItem, FindEventItems {

    private final JdbcTemplate jdbcTemplate;

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

    @Override
    public List<EventItem> findEventItems(int size, int page, int offset) {
        return null;
    }
}
