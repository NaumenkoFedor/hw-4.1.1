import java.util.Scanner;
public class Task01{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк треугольника: ");
        int rows = scanner.nextInt();

// Заполненный треугольник
        System.out.println("Заполненный треугольник:");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}