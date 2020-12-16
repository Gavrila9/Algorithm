public class LinkedlistDelete {
    public Node delete4Equals(Node head, int value){
        while(head!=null && head.getValue() == value){
            head = head.getNext();
        }
        Node prev = head;
        if(head == null){
            return null;
        }
        //loop invariant: list nodes from head up to prev has been
        //processed. (Nodes with values equal to value are deleted.)
        while (prev.getNext() != null){
            //prev.getNext() == null
            if(prev.getNext().getValue() == value){
                //delete it
                prev.setNext(prev.getNext().getNext());
            }else {
                prev = prev.getNext();
            }
        }
        return head;
    }
}
