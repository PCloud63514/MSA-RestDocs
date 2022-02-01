package org.pcloud.item.infrastructure;

import io.vavr.control.Try;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.pcloud.item.application.FindEventItem;
import org.pcloud.item.application.FindEventItems;
import org.pcloud.item.model.EventItem;
import org.pcloud.item.model.Item;
import org.pcloud.item.model.ItemId;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

import static io.vavr.control.Option.none;
import static io.vavr.control.Try.of;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ItemDatabaseRepository implements ItemRepository, FindEventItem, FindEventItems {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public Optional<EventItem> findEventItemById(ItemId itemId) {

        return Optional.empty();
    }

    @Override
    public Optional<ItemDatabaseEntity> findById(ItemId itemId) {
        return Try
                .ofSupplier(() -> of(jdbcTemplate.queryForObject("select * from Item i where i.item_id = ?",
                        new BeanPropertyRowMapper<>(ItemDatabaseEntity.class),
                        itemId.getItemId())))
                .getOrElse(none());
    }

    @Override
    public void save(Item item) {

    }

    @Override
    public List<EventItem> findEventItems(int size, int page, int offset) {
        return null;
    }
}
