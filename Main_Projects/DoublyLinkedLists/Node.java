/**
 * @author Victor Daniel Arellana Assia
 * Date: 07/09/2026
 * Course: CS 1027
 * Assignment 2 - Doubly Linked List
 */
public class Node {
    Node next;
    Node prev;
    int value;
    
    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
