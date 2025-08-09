public class Traversing {
    public static void main(String[] args) {
//        int[] a={1,2,3,4};
//        for (int i=0;i<=a.length-1;i++){
//            System.out.println(a[i]);
//        }
//        int[] a={1,2,3,4};
//        int b=1;
//        for (int i=a.length-1;i<=b-1;i--){
//            int c=a[i];
//            System.out.println(c);
//
//        }
//
//        for (int i=0;i<=a.length-1;i++){
////            System.out.println(c);
//        }

        int[] a={2,3,4,5};

        int last=a.length-1;
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            if (a[i]==a[0]){
                int first=a[i];
                sum=first+last;
            }
        }
        System.out.println(sum);

    }
}
