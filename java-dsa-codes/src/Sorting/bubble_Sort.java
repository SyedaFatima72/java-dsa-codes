package Sorting;

public class bubble_Sort {
    public static void print(int[] array){
        for (int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array={2,3,1,6,8};

        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
        print(array);

    }
}
