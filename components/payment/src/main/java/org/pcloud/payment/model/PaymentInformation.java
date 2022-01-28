package org.pcloud.payment.model;

import lombok.NonNull;
import lombok.Value;

@Value
public class PaymentInformation {
    @NonNull
    PaymentId paymentId;
}
