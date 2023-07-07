package LinkedList;

public class CustomLinkedList {

    CustomNode head;
    int index = 0;
    CustomNode last = null;

    public void add(Object obj) {
        CustomNode cl = new CustomNode(obj, index);
        if(head == null) {
            head = cl;
            last = head;
        }else {
            last.next = cl;
            last = cl;
//            CustomNode temp = head;
//            while(temp.next!=null) {
//                temp = temp.next;
//            }
//            temp.next=cl;
        }
        index++;
    }

    public void insertAtFirst(Object obj) {
        CustomNode cl = new CustomNode(obj, index);
        if(head == null) {
            head = cl;
        }else {
            cl.next = head;
            head = cl;
        }
        index++;
    }

    public void insertAtGivenPosition(Object obj, int position) {
        CustomNode value = new CustomNode(obj, index);
        if(head == null) {
            head = value;
        }else {
            CustomNode temp = head;
            CustomNode curr = temp.next;
            while (temp.next != null) {
                if(temp.data.equals(position)) {
                    temp.next = value;
                    value.next = curr;
                    break;
                }else {
                    temp = temp.next;
                    curr = temp.next;
                }
            }temp.next = value;
        }
    }

    public Object get(int indexPassed) throws Exception {
        if(indexPassed < 0 || indexPassed >= index) {
            throw new Exception("index not found");
        } else {
            if (head == null) {
                throw new Exception("List is empty");
            }else {
                CustomNode temp = head;
                while (temp.next != null) {
                    if(temp.index == indexPassed) {
                        return temp.data;
                    }else {
                        temp = temp.next;
                    }
                }
                if (temp.index == indexPassed) {
                    return temp.data;
                }
            }
        }
        return null;
    }

    public void remove(Object obj) {
        if(head != null) {
            CustomNode previous = null;
            if(head.data == obj) {
                previous = head;
                head = head.next;
                previous.next = null;
                return;
            }
            CustomNode temp = head;
            while(temp.next != null) {
                if(temp.data.equals(obj)) {
                    previous.next = temp.next;
                    temp.next = null;
                    return;
                }else {
                    previous = temp;
                    temp = temp.next;
                }
            }if(temp.data == obj) {
                previous.next = null;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(head == null) {
            return sb.toString().concat("]");
        }else {
            CustomNode temp = head;
            while(temp.next!=null) {
                sb.append(temp.data+", ");
                temp = temp.next;
            }
            sb.append(temp.data);
        }
        return sb.toString().concat("]");
    }
}
