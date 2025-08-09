package Assignment;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        System.out.println("Enter limit:");
        int series=f.nextInt();
        int[] a=new int[series];

        if (series >= 1) {
            a[0] = 0;
        }
        if (series >= 2) {
            a[1] = 1;
        }
        for (int i=2;i<=a.length-1;i++){

                a[i] = a[i - 1] + a[i - 2];

        }
        for (int i=0;i<=a.length-1;i++){
            System.out.print(a[i] +" ");
        }
    }
}
