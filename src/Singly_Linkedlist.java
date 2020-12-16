import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//单向链表的实现
/*
* 链表 容易理解 代码难写
* 递归：数组每一个元素作为一个节点，然后节点首尾相接， 必须null结尾 必须返回第一个节点作为表头。
* 递归：严格定义 递归函数作用，包括参数 返回值 Side-effect， 先一般后特殊， 每次调用必须缩小规模为1
* 循环：定义循环不变式 并 保持
* 循环：先一般后特殊， 向前推进循环不变式的变量值 每次规模为1
* */
public class Singly_Linkedlist {
    /*
    * @param data the data to create the list
    * @return head of the linked list. The returned linked list ends with last node with getNext() = null
    * */
    public Node createLinkedList(List<Integer> data){
        if(data.isEmpty()){
            return null;
        }
        Node firstNode = new Node(data.get(0));
        firstNode.setNext(createLinkedList(data.subList(1,data.size())));
        return firstNode;

    }
    public void printReverseLinkedList(Node head){
        if(head == null) return;
        printReverseLinkedList(head.getNext());
        System.out.println(head.getValue());
    }
    public static void main(String[] args) {
        Singly_Linkedlist s = new Singly_Linkedlist();
//        Node.printLinkedList(s.createLinkedList(new ArrayList<>()));
//        Node.printLinkedList(s.createLinkedList(Arrays.asList(1)));
//        Node.printLinkedList(s.createLinkedList(Arrays.asList(1,2,3,4,5)));
        s.printReverseLinkedList(s.createLinkedList(Arrays.asList(1,2,3,4,5)));

    }
}
