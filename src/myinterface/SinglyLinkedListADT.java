package myinterface;

public interface SinglyLinkedListADT {
    void addFirst(int element);
    boolean isEmpty();
    int size();
    void addLast(int element);
    void addLastWithoutUsingTail();
    void traverse();
    void addAfterGivenNode(int givenElement, int element);
    int removeFirst();
    int removeLast();
    int removeGivenNode(int givenElement);
    boolean search(int element);
    int first();
    int last();
}
