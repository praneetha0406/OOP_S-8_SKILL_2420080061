package skill1;
import java.util.Scanner;
public class StudentDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        long roll = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Passed (true/false): ");
        boolean passed = sc.nextBoolean();
        System.out.println("Roll Number : " + roll);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Gender      : " + gender);
        System.out.println("Pass Status : " + passed);
    }
}
