public class Task01 {
    public static void main(String[] args) {
            int f1 = 0;
            int f2 = 1;
            for (int f3 = 0; f3 <= 10_000_000; f3++) {
                System.out.print(f3 + " ");
                f3 = f1 + f3;
                f1 = f2;
                f2 = f3;
            }

            two:
            for (int n = 0; n < 10; n++) {
                int j;
                for (j = 10; j > 0; j--) {
                    System.out.print(j - n + " ");
                }
                if (j + n == 5 && n > 0) break two;
            }
        }

}
