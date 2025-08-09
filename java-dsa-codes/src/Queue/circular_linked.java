package Queue;
public class circular_linked {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            next=null;
        }
    }
    static class L_Queue{
         static Node front;
        static Node rear;
        public static boolean isEmpty(){
            return front==null && rear==null;
        }
        //enqueue
        public static void add(int data){
           Node newNode=new Node(data);
            if (rear==null){
                front=newNode;
                rear=newNode;
            }
            else {
                rear.next=newNode;
                rear=newNode;
                rear.next=front;
            }
        }
        //dequeue
        public static void remove(){
            if (isEmpty()){
                System.out.println("Empty list");

            }
            if(front==rear){
                front=rear=null;
            }
            else {
                front=front.next;
                rear.next=front;
            }

        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty list");

            }
            return front.data;
        }
    }

    public static void main(String[] args) {
        L_Queue list=new L_Queue();
        list.add(12);
        list.add(21);
        list.add(13);
        list.add(31);
        list.add(50);

        while (!list.isEmpty()){
            System.out.println(list.peek());
            list.remove();
        }
    }
}
