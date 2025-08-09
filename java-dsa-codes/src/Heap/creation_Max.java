package Heap;

public class creation_Max {
    int[] heap;
    int size;
    int capacity;
    creation_Max(int capacity){
        this.capacity=capacity;
        size=0;
        heap=new int[capacity];
    }
    public int parent(int i){
        return (i-1)/2;
    }
    public int left_child(int i){
        return (i*2+1);
    }
    public int right_child(int i){
        return (i*2+2);
    }
    public void swap(int i,int j){
        int temp;
        temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    public void insertion(int element){
        if(size==capacity){
            System.out.println("heap is full");
        }
        int current_index=size;
        heap[size]=element;
        size++;

        //Max heap
        while (current_index>0 && heap[current_index]>heap[parent(current_index)]){
              swap(current_index,parent(current_index));
              current_index = parent(current_index);
        }
    }

    public void display(){
        for (int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        creation_Max list=new creation_Max(5);
        list.insertion(4);
        list.insertion(6);
        list.insertion(1);
        list.insertion(8);
        System.out.println("max heap");
        list.display();
    }
}