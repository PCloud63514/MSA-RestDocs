package org.pcloud.order;

import java.time.LocalDateTime;

public interface Order {

    default OrderId orderId() {
        return getOrderInformation().getOrderId();
    }

    default OrderStatus orderStatus() {
        return getOrderInformation().getOrderStatus();
    }

    default LocalDateTime requestAt() {
        return getOrderInformation().getRequestAt();
    }

    default LocalDateTime updateAt() {
        return getOrderInformation().getUpdateAt();
    }

    OrderInformation getOrderInformation();
}
