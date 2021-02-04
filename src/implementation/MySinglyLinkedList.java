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
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        }
        else {
            node.setNext(head);
            head = node;
        }
        size++;
    }
    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }
    @Override
    public void traverse() {
        Node temp = head;
        while(temp != null)  {
            System.out.print(temp.getData() + "-->");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
    @Override
    public int removeFirst() {
        if (isEmpty()) {
            return -1;
        }
        else {
            Node response = head;
            if (head == tail) {
                head = null;
                tail = null;
                size--;
            }
            else {
                head = head.getNext();
                size--;
            }
            return response.getData();
        }
    }

    @Override
    public int removeLast() {
        if (isEmpty()) {
            return -1;
        }
        else {
            Node temp = head;
            Node previous = null;
            while (temp.getNext() != null) {
                previous = temp;
                temp = temp.getNext();
            }
            if (previous == null) {
                head = null;
                tail = null;
                size--;
            }
            else {

            }
        }
    }
}
