import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter 5 integers:");
        for(int i = 0; i < array.length; i++){
            array[i] = f.nextInt();
        }

        System.out.println("\nForward:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\nReverse:");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
