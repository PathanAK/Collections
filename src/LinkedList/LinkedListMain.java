package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);

        CustomLinkedList cl = new CustomLinkedList();

        cl.add(5);
        cl.add(6);
        cl.add(7);
        cl.add(8);
        cl.add(12);
        cl.add(15);
        cl.add(34);
        cl.add(20);
        cl.add(30);
        cl.add(40);
//        cl.insertAtGivenPosition(15,34);

        System.out.println(cl);
        System.out.println(cl.get(5));
        cl.remove(30);
        System.out.println(cl);
    }
}
