package ArrayList;

import java.util.List;

public class Thread2 extends Thread{


    List<Integer> l = null;

    public Thread2(List<Integer> l, String threadName) {
        super(threadName);
        this.l = l;
    }

    @Override
    public void run() {
        l.add(20);

    }
}
