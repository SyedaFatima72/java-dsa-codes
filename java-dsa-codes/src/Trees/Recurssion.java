package Trees;

public class Recurssion {
    static int factorial(int num){
        if (num!=0){
            return num*factorial(num-1);
        }
        else
            return 1;
    }

    public static void main(String[] args) {
        int num=4;
        int result;
        result=factorial(num);
        System.out.println("factorial of "+ num+" is "+result);
    }
}
