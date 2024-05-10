import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("введите число: ");
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


    public static boolean isPalindrome(int number) {
        int originNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originNumber == reversedNumber;
    }
}