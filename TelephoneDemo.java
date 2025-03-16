import java.util.*;

abstract class Telephone {
    abstract void call();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    void call() { System.out.println("Dialing..."); }
    void lift() { System.out.println("Connected."); }
    void disconnect() { System.out.println("Disconnected."); }
    void browseInternet() { System.out.println("Browsing..."); }
}

public class TelephoneDemo {
    public static void main(String[] a) {
        try (Scanner s = new Scanner(System.in)) {
            SmartTelephone p = new SmartTelephone();
            System.out.print("Enter action (call, lift, disconnect, browse): ");
            switch (s.next().trim().toLowerCase()) {
                case "call": p.call(); break;
                case "lift": p.lift(); break;
                case "disconnect": p.disconnect(); break;
                case "browse": p.browseInternet(); break;
                default: System.out.println("Invalid action");
            }
        }
    }
}
