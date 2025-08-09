package Queue;

public class array {
    static class Queue{
        static int array[];
        static int size;
        static int rear;
        public Queue(int size){
            array=new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
          return rear==-1;
        }
        //enqueue
        public static void add(int data){
            if (rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            else {
                rear++;
                array[rear]=data;
            }
        }
        //dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else {
                int front=array[0];
                for (int i=0;i<rear;i++){
                    array[i]=array[i+1];
                }
                rear--;
                return front;
            }
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else {
                return array[0];
            }
        }

    }

    public static void main(String[] args) {
        Queue list=new Queue(5);
        list.add(1);
        list.add(2);
        list.add(3);
        while (!list.isEmpty()){
            System.out.println(list.peek());
            list.remove();
        }
    }
}
