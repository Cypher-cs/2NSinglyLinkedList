/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 27-02-2021
Time: 00:35
File: MyMain.java 

*/
package main;

import implementation.MySinglyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MySinglyLinkedList linkedList = new MySinglyLinkedList();
        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addAfterGivenNode(20, 25);
        linkedList.traverse();
        System.out.println("Size = " + linkedList.size());
    }
}