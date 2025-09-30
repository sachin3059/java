package org.example;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
