/**
 * @author Victor Daniel Arellana Assia
 * Date: 07/09/2026
 * Course: CS 1027
 * Assignment 2 - Doubly Linked List
 */

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void add(int value){
        Node newNode = new Node(value);
        
        if(head == null){ // List is empty
            head = newNode; // Set Head and Tail to the new node
            tail = newNode;
        } else {
            tail.next = newNode; // If the list is not empty, add the new node to the end of the list and set the tail to the new node and the previous to the previous node
            newNode.prev = tail;
            tail = newNode;
        }
    }

    

    public boolean remove(int value) {
        Node current = head; // Start from the head of the list and traverse through the list until we find the node with the value we want to remove

        while (current != null){
            if(current.value == value){ // If we find the node with the value we want to remove, we need to update the next and previous pointers of the surrounding nodes to remove the current node from the list
                if(current.prev != null){
                    current.prev.next = current.next;
                } else { // If the current node is the head of the list, we need to update the head pointer to the next node
                    head = current.next;
                }

                if(current.next != null){ // If the current node is not the tail of the list, we need to update the previous pointer of the next node to point to the previous node
                    current.next.prev = current.prev;
                } else { // If the current node is the tail of the list, we need to update the tail pointer to the previous node
                    tail = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse() {
        Node current = head;
        Node temp = null; // Temporary variable to hold the previous node

        while (current != null){ // Traverse through the list and swap the next and previous pointers of each node to reverse the list
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;     
        }
        
        tail = head; // Set the tail to the head of the list since we have reversed the list and the head is now the tail
        
        if (temp != null) {
            
            head = temp.prev;  // Set the head to the last node we visited, which is now the new head of the list after reversing
        }
        
    }

    public void print(){
        Node current = head;
        while(current != null){ // Traverse through the list and print the value of each node
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void deleteList() { // Unlink all nodes in the list and set head and tail to null to delete the list
        head = null;
        tail = null;
    }
    public void printToString(StringBuilder sb) {
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
    }
}
