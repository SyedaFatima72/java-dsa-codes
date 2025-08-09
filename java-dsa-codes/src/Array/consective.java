public class consective {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 18, 9, 10, 11, 12,18, 13, 14, 15, 16, 17, 18, 18, 19, 20};

        int same = 0;
        for (int i = 0; i < a.length ; i++) {
//            if(a[i]==a[i+1]){
//                System.out.println(a[i]);
//            }
            for (int j = 0; j < a.length; i++) {
                if (a[i] == a[j]) {
                    same = a[i];
                    same++;
                }
            }
        }
        System.out.println(same);

    }
}
