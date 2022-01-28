package org.pcloud.order;

import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
public class OrderId {
    @NonNull
    UUID orderId;
}
