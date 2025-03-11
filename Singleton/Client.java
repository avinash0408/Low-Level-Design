package Singleton;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PaymentGateway{
    private static PaymentGateway instance = null;
    private PaymentGateway(){
        System.out.println("Payment Gateway Initialized");
    }
    private static Lock mtx = new ReentrantLock();
    public static PaymentGateway getInstance(){
        if(instance == null){
            mtx.lock();
            if(instance == null){
                instance = new PaymentGateway();
            }
            mtx.unlock();
        }
        return instance;
    }
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through the payment gateway.");
    }
}

public class Client {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = PaymentGateway.getInstance();
        paymentGateway.processPayment(100.00);
        PaymentGateway anotherPaymentGateway = PaymentGateway.getInstance();

        if (paymentGateway == anotherPaymentGateway) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Singleton pattern is not working correctly.");
        }
    }
}
