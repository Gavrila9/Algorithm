import java.util.ArrayList;
import java.util.Arrays;

public class Singly_Linkedlist_Reverse {
    /*
    * Reverse a linked list （recursion mode)
    * @param head the linked list to reverse
    * head of the reversed linked list
    * */
    public Node reverseLinkedList(Node head){
        //size == o || size ==1
        if(head == null || head.getNext() == null){
            return head;
        }
        Node newhead = reverseLinkedList(head.getNext());
//        head.getNext().setNext(head);
//        head.setNext(null);
        return newhead;
    }
    /*
     * Reverse a linked list (loop mood)
     * @param head the linked list to reverse
     * head of the reversed linked list
     * */
    public Node reverseLinkedListLoop(Node head){
        Node newHead = null;
        Node curHead = head;
        //loop invariant
        //newHead points to the linked list already reversed.
        //curHead points the linked list not yet reversed.
        while (curHead!=null){
            //loop invariant holds.
            //curHead ==null, loop out
            Node next = curHead.getNext();
            curHead.setNext(newHead);
            newHead = curHead;
            curHead = next;
            //loop invariant holds.
        }
        //loop invariant holds.
        return newHead;
    }
    public Node createLagerLinkedList(int size){
        Node prev = null;
        Node head = null;
        for (int i = 1; i <= size; i++) {
            Node node = new Node(i);
            if(prev != null){
                prev.setNext(node);
            }else {
                head = node;
            }
            prev = node;
        }
        return head;
    }
    public static void main(String[] args) {
        Singly_Linkedlist s = new Singly_Linkedlist();
        Singly_Linkedlist_Reverse r = new Singly_Linkedlist_Reverse();
        Node.printLinkedList(r.reverseLinkedList(s.createLinkedList(new ArrayList<>())));
        Node.printLinkedList(r.reverseLinkedList(s.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(r.reverseLinkedList(s.createLinkedList(Arrays.asList(1,2,3,4,5))));
//        Node.printLinkedList(r.createLagerLinkedList(100));

    }
}
