package org.pcloud.item.application;

import org.pcloud.item.model.EventItem;

import java.util.List;

@FunctionalInterface
public interface FindEventItems {
    List<EventItem> findEventItems(int size, int page, int offset);
}
