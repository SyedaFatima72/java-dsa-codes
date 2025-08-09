import java.util.Scanner;

public class Testing_Arrays {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        int[] a=new int[6];
        int large=a[0];
        int count=0;
        for (int i=0;i<=a.length-1;i++){
            a[i]=f.nextInt();

        }
        for (int i=0;i<=a.length-1;i++){
            if(a[i]>large){
                large=a[i];
                count=1;
            } else if (a[i]==large){
                count++;
            }

        }
        System.out.println("large "+large);
//
//        for (int i=0;i<=a.length-1;i++){
//
//            sum+=large;
//        }

        System.out.println(count);
    }
}
