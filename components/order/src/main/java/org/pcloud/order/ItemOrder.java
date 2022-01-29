package org.pcloud.order;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;
import org.pcloud.item.model.ItemInformation;

@Value
@AllArgsConstructor
@EqualsAndHashCode(of="orderInformation")
public class ItemOrder implements Order {
    @NonNull
    OrderInformation orderInformation;
    @NonNull
    ItemInformation itemInformation;
}
