package stack;

public class even_odd {
    static class Stack {
        static int[] stack = new int[5];
        static int top = -1;

        public static boolean isEmpty() {
            return top == -1;
        }

        public static void push(int data) {
            if (top >= stack.length - 1) {
                System.out.println("Stack overflow");
            } else {
                top++;
                stack[top] = data;
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }

            int data = stack[top];
            top--;

            if (data % 2 == 0) {
                return data;
            } else {
                return pop(); // Recur for the next item in the stack
            }
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return stack[top];
        }
    }

    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        while (!list.isEmpty()) {
            int popped = list.pop();
            if (popped != -1) {
                System.out.println(popped);
            }
        }
    }
}
