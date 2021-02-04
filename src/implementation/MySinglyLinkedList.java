package implementation;

import myinterface.SinglyLinkedListADT;

public class MySinglyLinkedList implements SinglyLinkedListADT {
    private Node head;
    private Node tail;
    private int size;

    public MySinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
}
