package Queue;

public class create_array {
    static public class queue{
        int size;
        static int queue[];

        static int front=-1;
        static int rear=-1;
      public queue(int size){

           queue =new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
          return front==-1 && rear==-1;
        }

        public  void enqueue(int data){
          if (rear==size-1){
              System.out.println("Queue is full");
          }
          else {
              rear++;
              queue[rear]=data;
          }
        }
        public int dequeue(){
          if (isEmpty()){
              System.out.println("Empty Queue");
              return -1;
          }
          int  temp=queue[0];
          for(int i=0;i<rear;i++){
              queue[i]=queue[i+1];
          }
          rear--;
          return temp;
        }
        public static int peek_start(){
          if (isEmpty()){
              System.out.println("EMpty queue");
              return -1;
          }
          return queue[0];
        }
        public static int peek_last(){
          if (isEmpty()){
              System.out.println("EMpty queue");
              return -1;
          }
          return queue[rear];
        }

    }

    public static void main(String[] args) {
        queue list=new queue(5);
        list.enqueue(10);
        list.enqueue(11);
        list.enqueue(12);
        list.enqueue(13);
        list.enqueue(14);

        while (!list.isEmpty()){
            System.out.println(list.peek_start());
            list.dequeue();
        }

        System.out.println("last element");

        while (!list.isEmpty()){
            System.out.println(list.peek_last());

        }

    }
}
