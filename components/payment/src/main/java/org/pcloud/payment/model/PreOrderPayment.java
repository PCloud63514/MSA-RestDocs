package org.pcloud.payment.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;

@Value
@AllArgsConstructor
@EqualsAndHashCode(of="paymentInformation")
public class PreOrderPayment implements Payment {
    @NonNull
    PaymentInformation paymentInformation;
}
