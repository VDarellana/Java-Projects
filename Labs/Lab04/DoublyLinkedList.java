public class DoublyLinkedList {
    Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }
    
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void printListReverse() {
        Node currentNode = head;

        if (currentNode == null) {
            return;
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        while(currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFront(10);
        doublyLinkedList.addFront(11);
        doublyLinkedList.addFront(12);
        doublyLinkedList.printList(); // output: 12 11 10
        doublyLinkedList.removeValue(11);
        doublyLinkedList.printList(); // output: 12 10
        doublyLinkedList.printListReverse(); // output: 10 12
    }
    public void removeValue(int data) {
    Node currentNode = head;
    if (currentNode == null) {
        return;
    }
    // if the node to be removed is the head
    if (currentNode.data == data) {
        head = currentNode.next;
        if (head != null) {
            head.prev = null;
        }
        return;
    }
    while (currentNode != null && currentNode.data != data) {
     currentNode = currentNode.next;
    }
    
    if (currentNode == null) {
     return; // value not found
    }
    // if the node to be removed is in the middle or end
    if (currentNode.next != null) {
    // set the next node's prev pointer to currentNode's prev node
    currentNode.next.prev = currentNode.prev;
    }
    if (currentNode.prev != null) {
    // set the previous node's next pointer to currentNode's next node
    currentNode.prev.next = currentNode.next;
    }
}

}

