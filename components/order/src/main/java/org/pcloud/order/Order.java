package org.pcloud.order;

public interface Order {

    default OrderId orderId() {
        return getOrderInformation().getOrderId();
    }

    OrderInformation getOrderInformation();
}
