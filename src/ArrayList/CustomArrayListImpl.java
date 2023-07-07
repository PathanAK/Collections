package ArrayList;

import java.util.Arrays;

public class CustomArrayListImpl {

    Object[] a = null;
    int index = 0;

    public CustomArrayListImpl(int size) {
        a = new Object[size];
    }

    public CustomArrayListImpl() {
        a = new Object[5];
    }

    /*by adding the key word synchronized it will make the
     customArrayList synchronized and thread safe
    */
    public synchronized void add(Object obj) {
        if(a.length<=index) {
            int newSize = (a.length + (a.length/2));
            a=Arrays.copyOf(a,newSize);
//            Object[] ar = new Object[newSize];
//            for (int i=0; i < a.length; i++ ) {
//                ar[i]=a[i];
//            }
//            a=ar;
        }
        a[index] = obj;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<index; i++) {
            if (a[i] != null) {
                sb.append(a[i]);
                if (i < index - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    Object get(int index) throws Exception {
        if(index >= a.length || index < 0) {
            throw new Exception("Index not found");
        }
        return a[index];
    }

    int size() {
        return a.length;
    }

    Object remove(int indexToBeRemoved) throws Exception {
        Object obj = get(indexToBeRemoved);
        int numOfShiftOperations = a.length-indexToBeRemoved-1;
        if(numOfShiftOperations>0) {
            System.arraycopy(a,indexToBeRemoved+1,a,indexToBeRemoved,numOfShiftOperations);
        }
        a[--index]=null;
        return obj;
    }
}
