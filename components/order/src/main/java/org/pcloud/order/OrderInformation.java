package org.pcloud.order;

import lombok.NonNull;
import lombok.Value;

@Value
public class OrderInformation {
    @NonNull
    OrderId orderId;
}
