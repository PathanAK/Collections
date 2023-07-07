package ArrayList;

import java.util.ArrayList;

public class ArrayListImpl {
    public static void main(String[] args) throws Exception {
        ArrayList a = new ArrayList(5);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);


        CustomArrayListImpl c = new CustomArrayListImpl();

        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        System.out.println(c);

        System.out.println(c.remove(2));

        System.out.println(c);

    }
}
