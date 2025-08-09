package Searching;

public class linear {
    public static int search(int[] Array,int key){
        for (int i=0;i<Array.length;i++){
            if (Array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Array[]={2,4,6,12,8,13,3};
        int key=6;

        int index=(search(Array,key));
        if (index!=-1){
            System.out.println("The value "+key+ " is at index "+search(Array,key));
        }
        else {
            System.out.println("Not Found");
        }

    }
}
