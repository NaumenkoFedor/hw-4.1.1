import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dist = 0;
        double x;
        double y;
        int days = 0;
        System.out.print("введите Х: ");
        x = sc.nextDouble();
        System.out.print("введите Y: ");
        y = sc.nextDouble();
        while (dist < y) {
            dist += x;
            x *= 1.1;
            days++;

        }
        System.out.println(days);


    }
}