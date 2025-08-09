package Sorting;

public class selection_sort {
   public static void print(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

   }
    public static void main(String[] args) {
        int[] array={4,2,7,8,1};
        int smallest;
        for (int i=0;i<array.length-1;i++){
            smallest=i;
            for (int j=i+1;j<array.length;j++){
                if (array[smallest]>array[j]){
                    smallest=j;
                }
            }
            int temp;
            temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        }
        print(array);
    }
}
