package org.pcloud.payment.model;

public interface Payment {
    default PaymentId paymentId() {
        return getPaymentInformation().getPaymentId();
    }

    PaymentInformation getPaymentInformation();
}
