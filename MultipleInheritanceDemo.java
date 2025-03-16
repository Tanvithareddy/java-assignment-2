import java.util.*;

interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    public void eat() { System.out.println("Bat eats insects."); }
    public void fly() { System.out.println("Bat flies at night."); }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter action (eat/fly):");
        String action = sc.next().toLowerCase();
        
        Bat bat = new Bat();
        if (action.equals("eat")) bat.eat();
        else if (action.equals("fly")) bat.fly();
        else System.out.println("Invalid action");
        
        sc.close();
    }
}
