package org.pcloud.payment.model;

import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
public class PaymentId {
    @NonNull
    UUID paymentId;
}
