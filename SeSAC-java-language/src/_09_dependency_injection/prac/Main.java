package _09_dependency_injection.prac;

public class Main {
    public static void main(String[] args) {

        INotificationService emailService = new EmailNotificationService();
        OrderService orderServiceWithEmail = new OrderService(emailService);
        orderServiceWithEmail.processOrder();

        System.out.println("---");

        INotificationService smsService = new SMSNotificationService();
        OrderService orderServiceWithSMS = new OrderService(smsService);
        orderServiceWithSMS.setNotificationService(smsService);
        orderServiceWithSMS.processOrder();
    }
}
