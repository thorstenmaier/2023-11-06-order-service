package com.example.orderservice;

import java.util.List;

public class CustomerPaymentMethodResource {

    private List<PaymentMethod> paymentMethods;

    public CustomerPaymentMethodResource() {
    }

    public CustomerPaymentMethodResource(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @Override
    public String toString() {
        return "CustomerPaymentMethodRessource{" +
                "paymentMethods=" + paymentMethods +
                '}';
    }
}
