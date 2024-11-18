package com.example;
public class Test {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        ChainLink link1 = new ChainLink("Red");
        ChainLink link2 = new ChainLink("Blue");
        ChainLink link3 = new ChainLink("Green");

        // Set/insert elements
        SinglyLinkedList.insert(list, link1);
        SinglyLinkedList.insert(list, link2);
        SinglyLinkedList.insert(list, link3);

        // Print the list
        System.out.println("Printing list:");
        SinglyLinkedList.printList(list);

        // Get elements
        ChainLink result = SinglyLinkedList.get(list, 1);
        if (result != null) {
            System.out.println("Element at index 1: " + result.color);
        } 
        else {
            System.out.println("Index 1 is out of bounds.");
        }

        result = SinglyLinkedList.get(list, 5);
        if (result != null) {
            System.out.println("Element at index 5: " + result.color);
        } 
        else {
            System.out.println("Index 5 is out of bounds.");
        }
    }
}

