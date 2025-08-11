package skill1;
import java.util.Scanner;
public class PrimitiveDataDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        byte age = sc.nextByte();
        System.out.print("Enter current year: ");
        short year = sc.nextShort();
        System.out.print("Enter country population: ");
        long population = sc.nextLong();
        System.out.print("Enter distance to moon in km: ");
        long distance = sc.nextLong();
        System.out.print("Enter value of Pi: ");
        float pi = sc.nextFloat();
        System.out.print("Enter gravity value: ");
        double gravity = sc.nextDouble();
        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);
        System.out.print("Is Java fun (true/false): ");
        boolean fun = sc.nextBoolean();
        System.out.println("Age: " + age);
        System.out.println("Current Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Distance to Moon: " + distance);
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun: " + fun);
    }
}
