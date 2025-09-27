package com.example.learningSpringBootApp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component  // to make bean
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RazorpayPaymentService implements PaymentService  {

    @Override
    public String pay(){
        String payment = "Razorpay Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
