package Searching;

public class Binary {
    public static int binary(int[] Array,int key){
        int start=0;
        int end=Array.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (Array[mid]==key){//camparison
                return mid;
            }
            if (Array[mid]<key){//right
                start=mid+1;
            } else if (Array[mid]>key) {//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Array[]={1,2,3,4,5,6,7,8};
        int key=7;
        System.out.println("The element "+key+" is at index "+binary(Array,key));
    }
}
