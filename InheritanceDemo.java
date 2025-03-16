import java.util.*;
class Person {
    String name, address;
    int age;
    long phoneNumber;
    Person(String name, int age, long phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Phone: " + phoneNumber + ", Address: " + address);
    }
}
class Student extends Person {
    String course;
    Student(String name, int age, long phoneNumber, String address, String course) {
        super(name, age, phoneNumber, address);
        this.course = course;
    }
    void printDetails() {
        super.printDetails();
        System.out.println("Course: " + course);
    }
}
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, long phoneNumber, String address, String subject) {
        super(name, age, phoneNumber, address);
        this.subject = subject;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Subject: " + subject);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Details (Name Age Phone Address Course):");
        Student student = new Student(scanner.next(), scanner.nextInt(), scanner.nextLong(), scanner.next(), scanner.next());
        System.out.println("Enter Teacher Details (Name Age Phone Address Subject):");
        Teacher teacher = new Teacher(scanner.next(), scanner.nextInt(), scanner.nextLong(), scanner.next(), scanner.next());
        System.out.println("\nStudent Information:");
        student.printDetails();
        System.out.println("\nTeacher Information:");
        teacher.printDetails();
        scanner.close();
    }
}
