package stack;

import java.util.ArrayList;
import java.util.Stack;

public class Push_At_Bottom {

    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                int top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
            }
        }

        public void PushAtBottom(int data) {
            if (!isEmpty()) {
                int top = pop();
                PushAtBottom(data);
                push(top);
            } else {
                push(data);
            }
        }
    }

    public static void main(String[] args) {
        stack list = new stack();
        list.push(1);
        list.push(2);
        list.push(3);

        list.PushAtBottom(4);

        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }
    }
}
