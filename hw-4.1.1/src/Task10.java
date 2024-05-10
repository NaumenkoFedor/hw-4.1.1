public class Task10 {
    public static void main(String[] args) {
        int maxRange = 20;
        int[] lst = new int [maxRange];
        for (int i = 0; i < maxRange; i++) {
            lst[i] = maxRange - 1;
        }
        int count = 0;
        int sum = maxRange;
        int lstCount = lst[count];
        while (lstCount != 1){
            int tmp = sum;
            while (sum % lstCount != 0){
                sum += tmp;
            }
            count++;
            lstCount = lst[count];
        }
        System.out.println(sum);

    }
}
