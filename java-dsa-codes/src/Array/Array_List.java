import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("a");

        ArrayList b=new ArrayList(2);
        b.add("s");
        b.add(2);
        b.add(3);

        int[] c=new int[2];
        ArrayList d=new ArrayList(Collections.singleton(c));

        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);

        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("d "+d);

        ArrayList list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        ArrayList sublist=new ArrayList(list.subList(0,3));
        System.out.println("List "+list);
        System.out.println("Sublist "+sublist);

    }


}
