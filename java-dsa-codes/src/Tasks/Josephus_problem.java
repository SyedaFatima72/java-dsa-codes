package Assignment;

import java.util.Scanner;

public class Josephus_problem {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        System.out.println("Enter the total number of soldiiers");
        int n = f.nextInt();

        int power = 1;
        while (power * 2 <= n) {
            power *= 2;
        }

        // System.out.println("The greatest power of 2 in th number is: " + power);
        int l=n-power;

        //System.out.println("l is " + l);

        int saved=2*l+1;
        System.out.println("The saved person is : "+saved);
    }
}
