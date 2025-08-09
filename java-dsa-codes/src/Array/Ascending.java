public class Ascending {
    public static void main(String[] args) {
        int[] a={2,4,1,3};
        int sort=a[0];
        int list=0;

        for (int i=0;i<=a.length-1;i++){
            System.out.println("Array : "+a[i]);
        }
        for (int i=0;i<=a.length-1;i++){
            if (a[i]<sort){
                    sort = a[i];
                    list++;
            }
        }
        for (int i=0;i<=a.length-1;i++){
            System.out.println("sorterd array : "+sort);
            System.out.println("sorterd array : "+list);
        }
    }
}
