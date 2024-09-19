package com.hellopayment;

import java.io.IOException;
import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) throws IOException {
        //PaymentService paymentService = new PaymentService(new WebApiExRateProvider());
        ObjectFactory factory = new ObjectFactory();
        PaymentService paymentService = factory.paymentService();

        Payment payment = paymentService.prepare(100L, "USD", BigDecimal.valueOf(50.7));
        System.out.println(payment);

    }
}
