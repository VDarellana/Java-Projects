public class SinglyLinkedList {
    Node head;
    Node tail;
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void shiftRight(){
        if(head == null || head.next == null){
            return;
        }

        Node curr = head;

        while (curr.next != tail)curr = curr.next;

        
        Node tmphead = head;
        Node tmpTail = tail;

        tmpTail.next = tmphead;
        curr.next = null;
        head = tmpTail;
        tail = curr;
    
    }    
}
