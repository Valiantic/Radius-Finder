
import java.util.Scanner;

public class Circle_Radius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner intscan = new Scanner(System.in);

        System.out.println("Radius finder");
        System.out.println("");
        System.out.println("[A] RADIUS");
        System.out.println("[B] CIRCUMFERENCE");
        System.out.println("[C] AREA");
        System.out.println("[E] EXIT");
        String choice = scan.nextLine();
        System.out.println("");

        switch (choice.toUpperCase()) {
            case "A":
                System.out.println("Enter Circumference to find Radius");
                System.out.println("");
                int circum = intscan.nextInt();

                double pi = 3.14159265358979;

                double radius = circum / (2 * pi);

                System.out.println("The radius of the circle is: " + radius);

                break;
            case "B":
                System.out.println("Enter Radius to find Circumference");
                System.out.println("");
                int rad = intscan.nextInt();

                double pi2 = 3.14159265358979;

                double circumf = 2 * pi2 * rad;

                System.out.println("The circumference of the circle is: " + circumf);

                break;
            case "C":
                System.out.println("Enter Radius to find the Area of the Circle");
                System.out.println("");
                int radi = intscan.nextInt();

                double pi3 = 3.14159265358979;

                double area = pi3 * radi * radi;

                System.out.println("The circumference of the circle is: " + area);
                break;
            case "E":
                System.out.println("Thank you for using steven's radius finder! :>>>");
                break;
        }

    }
}
