package org.pcloud.order;

import lombok.NonNull;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class OrderInformation {
    /**
     * 주문 아이디
     */
    @NonNull
    OrderId orderId;

    /**
     * 주문 상태
     */
    @NonNull
    OrderStatus orderStatus;

    /**
     * 주문 요청 일자
     */
    @NonNull
    LocalDateTime requestAt;

    /**
     * 마지막 업데이트 일자
     */
    @NonNull
    LocalDateTime updateAt;
}
