package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            Thread1 t1 = new Thread1(list, "T1");
            Thread2 t2 = new Thread2(list, "T2");
            t1.start();
            t2.start();
        }

}
