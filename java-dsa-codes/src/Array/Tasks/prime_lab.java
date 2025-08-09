package Assignment;

import java.util.Scanner;

public class prime_lab {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        System.out.println("How many numbers you want to include in an array");
        int x=f.nextInt();
        int[] a=new int[x];
        System.out.println("Enter Array Elements");
        for (int i = 0; i<=a.length-1; i++){
            a[i]=f.nextInt();
        }
        System.out.println("Non Prime numbers from the array list are");
        for (int i=0;i<=a.length-1;i++){
            if(a[i]>2 && a[i]%2==0){
                System.out.println(a[i]);
            }
        }

    }
}
