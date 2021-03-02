package implementation;

import myinterface.SinglyLinkedListADT;

public class MySinglyLinkedList implements SinglyLinkedListADT {
    private Node head;
    private Node tail;
    private int size;

    public MySinglyLinkedList() {
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
        } else {
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
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "-->");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    @Override
    public int removeFirst() {
        if (isEmpty()) {
            return -1;
        } else {
            Node response = head;
            if (head == tail) {
                head = null;
                tail = null;
                size--;
            } else {
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
        } else {
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
            } else {
                previous.setNext(null);
                tail = previous;
                size--;
            }
            return temp.getData();
        }
    }

    @Override
    public void addLastWithoutUsingTail(int element) {
        Node node = new Node(element);
        if (!isEmpty()) {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setNext(null);
        }
        else {
            head = node;
            tail = node;
        }
    }

    @Override
    public void addAfterGivenNode(int givenElement, int element) {
        Node node = new Node(element);
        if (!isEmpty()) {
            Node temp = head;
            while(temp != null) {
                if (temp.getData() == givenElement){
                    break;
                }
                temp = temp.getNext();
            }
            if (temp != null) {
                if (temp == tail) {
                    temp.setNext(node);
                    tail = node;
                }
                else {
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                }
                size++;
            }
        }
    }

    @Override
    public int removeGivenNode(int givenElement) {
        return -1;
    }

    @Override
    public boolean search(int element) {
        return false;
    }

    @Override
    public int first() {
        if (!isEmpty()) {
            return head.getData();
        }
        return -1;//considering -1 as invalid
    }

    @Override
    public int last() {
        if (!isEmpty()) {
            return tail.getData();
        }
        return -1;
    }
    @Override
    public int middleNode() {
        if (!isEmpty()) {
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.getNext() != null) {
                slow = slow.getNext();
                fast = fast.getNext().getNext();
            }
            return slow.getData();
        }
        else {
            return -1;
        }
    }
}
