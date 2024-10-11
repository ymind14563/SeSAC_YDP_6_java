package _09_dependency_injection.prac;

public class OrderService {
    private INotificationService notificationService;

    public OrderService(INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(INotificationService setNotificationService) {
        this.notificationService = setNotificationService;
    }

    public void processOrder() {
        System.out.println("Order processed successfully");
        notificationService.sendMessage("Your order has been processed");

    }
}
