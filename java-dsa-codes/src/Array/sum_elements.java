public class sum_elements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        double sum = 0;
        double total = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            total++;
        }

        double average =  sum / total; // Calculate average after the loop

        System.out.println(sum);
        System.out.println(total);
        System.out.println(average);
    }
}
