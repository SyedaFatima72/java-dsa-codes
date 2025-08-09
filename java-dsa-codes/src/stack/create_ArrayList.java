package stack;

import java.util.ArrayList;
import java.util.Stack;

public class create_ArrayList {
    class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                int top = list.get(list.size() - 1);
                list.remove(top);
                return top;
            }
        }
    }
    public static void main(String[] args) {
        Stack list=new Stack();
        list.push(1);
        list.push(2);
        list.push(3);


       while (!list.isEmpty()){
            System.out.println(list);
            list.pop();
        }


     }
}

