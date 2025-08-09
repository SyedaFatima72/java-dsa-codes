package stack;

public class array {
    static class stack {
        static int[] stack = new int[5];
        static int top = -1;
        static int size=0;

        public static boolean isEmpty() {
            return top == -1;

        }

        public static void push(int data) {
            if (top >= stack.length - 1) {
                System.out.println("Stack overflow");
                return;
            } else {
                top++;
                size++;
                stack[top] = data;
            }
        }

        static int even=0;
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            } else {

                int data = stack[top];
                top--;
//                if (data%2==0){
//                    even=data;
//                }
                return data;
            }
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return stack[top];
        }
        public int size(){

            return size;
        }

        public static void main(String[] args) {
            stack list = new stack();
            list.push(1);
            list.push(2);
            list.push(3);
            list.push(4);
//            list.push(5);
//            list.push(6);
            while (!list.isEmpty()) {
                System.out.println(list.peek());
                list.pop();
            }
            System.out.println("The lenght of array is "+list.size());

//            int exp=10^2/4*2;
//            System.out.println(exp);

        }
    }
}
