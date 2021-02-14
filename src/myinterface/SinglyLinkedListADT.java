package myinterface;

public interface SinglyLinkedListADT {
    void addFirst(int element);
    boolean isEmpty();
    int size(); //O(1)
    void addLast(int element);
    int addLastWithoutUsingTail();
    void traverse();
    void addAfterGivenNode(int givenElement, int element);
    int removeFirst(); //O(1)
    int removeLast(); //O(N)
    int removeGivenNode(int givenElement);
    boolean search(int element);
    int first(); // O(1)
    int last(); // O(1)
}
