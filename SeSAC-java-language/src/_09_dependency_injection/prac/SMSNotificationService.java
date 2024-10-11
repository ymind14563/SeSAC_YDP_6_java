package _09_dependency_injection.prac;

public class SMSNotificationService implements INotificationService {
    public void sendMessage(String msg) {
        System.out.println("Sending SMS notification: " + msg);
    }

}
