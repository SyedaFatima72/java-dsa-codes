package Heap;

public class deletion_min {
    int heap[];
    int capacity;
    int size;
    deletion_min(int capacity){
        this.capacity=capacity;
        this.size=0;
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
    public void swap(int i, int j){
        int temp;
        temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }

    public void insertMin(int element){
        if (size==capacity){
            System.out.println("Heap is full");
        }
        int current_index=size;
        heap[size]=element;
        //min heap
        while (current_index>0 && heap[current_index]<heap[parent(current_index)]){
            swap(current_index,parent(current_index));
            current_index=parent(current_index);
        }
        size++;
    }
    public int delete(){
        if (size==0){
            System.out.println("Heap is empty");
            return -1;
        }
        int min=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapifydown(0);
       return min;

    }
    public void heapifydown(int index){
        int left_child_Index=left_child(index);
        int right_child_index=right_child(index);
        int smalllest=index;

        if(left_child_Index<size && heap[left_child_Index]<heap[smalllest]){
            smalllest=left_child_Index;
        }

        if (right_child_index<size && heap[right_child_index]>heap[smalllest]){
            smalllest=right_child_index;
        }
        if (smalllest!=index){
            swap(index,smalllest);
            heapifydown(smalllest);
        }
    }

    public void display(){
        for (int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        deletion_min list=new deletion_min(5);
        list.insertMin(2);
        list.insertMin(4);
        list.insertMin(1);
        list.insertMin(7);
        System.out.println("Min heap");
        list.display();
        System.out.println("Deleted Element");
        System.out.println(list.delete());
        System.out.println("heapified");
        list.display();

    }

}
