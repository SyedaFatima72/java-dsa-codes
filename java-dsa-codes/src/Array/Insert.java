import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
//        int[] Array={1,2,3};
//
//        int location=2;
//        int change=5;
//        for (int i=Array.length-1;i<location;i--){
//            Array[i]=Array[i-1];
//        }
//        Array[1]=change;
//        for (int i=0;i<=Array.length-1;i++){
//            System.out.println(Array[i]);
//        }



        int[] a={1,2,3,4,5};

        int loc=3;
        int insert=40;
        //for(int i=a.length-1;i>loc-1;i--){ if wanto exclude 5
        for(int i=a.length-1;i<loc-1;i--){
            a[i]=a[i-1];
        }
        a[loc]=insert;

        for (int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

//        Scanner f=new Scanner(System.in);
//        int[] array={1,2,3,4,5};
//        System.out.println("Enter the number you want to add");
//        int in=f.nextInt();
//        System.out.println("Set the postion");
//        int postion=f.nextInt();
//
//        for (int i=array.length-1;i<postion-1;i--){
//            a[i]=a[i-1];
//
//        }
//        array[postion-1]=in;
//
//        for (int i=0;i<=array.length-1;i++){
//            System.out.println(array[i]);
//        }
   }
}
