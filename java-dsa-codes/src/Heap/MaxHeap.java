package Heap;

public class MaxHeap {
    int[] heap;
    int size;
    int capacity;
    MaxHeap(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.heap=new int[capacity];
    }
    private int Parent(int i){
        return (i-1)/2;
    }
    private int leftChild(int i){
        return i*2+1;
    }
    private int rightChild(int i){
        return i*2+2;
    }
    private void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }

public void insertion(int element){
    if(size==capacity){
        System.out.println("Heap is full");
    }
    int current_index=size;
    heap[current_index]=element;
    size++;

    while (current_index > 0 && heap[current_index] > heap[Parent(current_index)]){
        swap(current_index,Parent(current_index));
        current_index=Parent(current_index);
    }
}
    public int removeMax(){
        if (size==0){
            System.out.println("Heap is empty");
            return -1;
        }

        int max=heap[0];
        heap[0]=heap[size-1];
        size--;
        int current_Index=0;
    while (true){

         int left_child=leftChild(current_Index);
         int right_child=rightChild(current_Index);
         int largest=current_Index;

         if (current_Index<size && heap[left_child]>heap[largest]){
             largest=left_child;
         }
         if (current_Index<size && heap[right_child]>heap[largest]){
             largest=right_child;
         }

         if (largest!=current_Index){
             swap(current_Index,largest);
             current_Index=largest;
         }
         else{
             break;
         }
      }
    return max;
    }
    public void display(){
        for (int i=0; i<size;i++){
            System.out.print(heap[i]+" ");
        }
    }

    public static void main(String[] args) {
        MaxHeap insert=new MaxHeap(12);
        insert.insertion(3);
        insert.insertion(2);
        insert.insertion(8);
        insert.insertion(1);
        insert.insertion(6);
        insert.insertion(10);
        insert.insertion(15);
        insert.insertion(14);

        System.out.println("Max order of given heap is");
        insert.display();

        System.out.println();

        System.out.println("Max order after deleting the root element :"+insert.removeMax());
        insert.display();


    }

}
