package Sorting;

public class insertion_sort {
    public static void print(int[] array){
        for (int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }

    }
    public static void main(String[] args) {
        int [] array={4,13,7,1,5};
        for (int i=1;i<array.length-1;i++){
            int unsorted=array[i];
            int sorted=i-1;
            while (sorted>=0 && unsorted<array[sorted]){
                array[sorted+1]=array[sorted];
                sorted--;
            }
            array[sorted+1]=unsorted;
        }
        print(array);
    }
}
