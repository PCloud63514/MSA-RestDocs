package org.pcloud.item.model;

public interface Item {

    default ItemId itemId() {
        return getItemInformation().getItemId();
    }

    default ItemName itemName() {
        return getItemInformation().getItemName();
    }

    ItemInformation getItemInformation();
}
