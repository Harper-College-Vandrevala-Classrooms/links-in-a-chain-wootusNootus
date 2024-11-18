package com.example;
public class SinglyLinkedList {

    Node head;

    static class Node {
        ChainLink data;
        Node next;
        
        // Recursion
        Node(ChainLink d) {
          data = d;
          next = null;
        }
    }

    public static void insert(SinglyLinkedList list, ChainLink data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } 
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }
    }

    public static ChainLink get(SinglyLinkedList list, int index) {
        Node currentNode = list.head;
        int count = 0;
    
        while (currentNode != null) {
            if (count == index) {
                return currentNode.data; 
            }
            currentNode = currentNode.next;
            count++;
        }
    
        return null;
    }
    

    public static void printList(SinglyLinkedList list) {
        System.out.println("Printing the list:");
        Node currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode.data.color + " ");
            currentNode = currentNode.next;
        }

        System.out.println();
    }
}