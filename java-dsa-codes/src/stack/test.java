package stack;

public class test {
//    static class Stack{
//       static int[] stack=new int[5];
//        static int top=-1;
//
//        public static boolean isEmpty(){
//            return top==-1;
//        }
//        public static boolean isFull(){
//            return top>=stack.length-1;
//        }
//        public static void push(int data){
//            if (isFull()){
//                System.out.println("Stack OverFlow");
//                return;
//            }
//            top++;
//            stack[top]=data;
//
//        }
//        public static int pop(){
//            if (isEmpty()){
//                System.out.println("Stack UnderFlow");
//                return -1;
//            }
//            int temp=stack[top];
//            top--;
//            return temp;
//        }
//        public static int peek(){
//            if (isEmpty()){
//                System.out.println("Stack UnderFLow");
//                return -1;
//            }
//            return stack[top];
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack list=new Stack();
//        list.push(1);
//        list.push(2);
//        list.push(3);
//        list.push(4);
//        while (!list.isEmpty()){
//            System.out.println(list.peek());
//            list.pop();
////            break;
//        }
//    }
//  static public class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//        }
//
//}
//    static  Node front;
//static public class Stack{
//
//
//        public static void push(int data){
//            Node newNode=new Node(data);
//            if (front==null){
//                front=newNode;
//            }
//            newNode.next=front;
//            front=newNode;
//
//        }
//        public void pop() {
//            if (front != null) {
//
//                front = front.next;
//
//            }
//
//        }
//        public static int peek(){
//
//            return front.data;
//        }
//        public static boolean isEmpty(){
//            return  front==null;
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Stack list=new Stack();
//        list.push(1);
//        list.push(2);
//        list.push(3);
//        list.push(4);
//        while (!list.isEmpty()){
//            System.out.println(list.peek());
//            list.pop();
//        }
//
//    }
static public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

    static Node front;

    static public class Stack {

        public static void push(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                front = newNode;
            } else {
                newNode.next = front;
                front = newNode;
            }
        }

        public void pop() {
            if (front != null) {
                front = front.next;
            }
        }

        public static int peek() {
            return front.data;
        }

        public static boolean isEmpty() {
            return front == null;
        }
    }

    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();

        }
        int a=2;
        int b=3;
        int c=4;
        int h=5;
        int d=6;
        int e=7;
        int f=8;
        int g=9;

        int infix=((((a+b)*c)-(h*(d-e)))/(f+g));
        System.out.println("infix "+infix);
//        ((((2+3)*4)-(5*(6-7)))/(8+9))
    }
}
