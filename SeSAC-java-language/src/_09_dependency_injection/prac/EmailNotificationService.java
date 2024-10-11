package _09_dependency_injection.prac;

public class EmailNotificationService implements INotificationService {
    public void sendMessage(String msg) {
        System.out.println("Sending email notification: " + msg);
    }
}
