import java.util.ArrayList;
import java.util.Arrays;

public class Singly_Linkedlist_Reverse {
    /*
    * Reverse a linked list
    * @param head the linked list to reverse
    * head of the reversed linked list
    * */
    public Node reverseLinkedList(Node head){
        //size == o || size ==1
        if(head == null || head.getNext() == null){
            return head;
        }
        Node newhead = reverseLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newhead;
    }
    public static void main(String[] args) {
        Singly_Linkedlist s = new Singly_Linkedlist();
        Singly_Linkedlist_Reverse r = new Singly_Linkedlist_Reverse();
        Node.printLinkedList(r.reverseLinkedList(s.createLinkedList(new ArrayList<>())));
        Node.printLinkedList(r.reverseLinkedList(s.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(r.reverseLinkedList(s.createLinkedList(Arrays.asList(1,2,3,4,5))));

    }
}
