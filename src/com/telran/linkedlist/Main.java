package com.telran.linkedlist;

public class Main {

    public static void main(String[] args) {
        Node head = new Node();
        head.setData("head");
        MyLinkedList list = new MyLinkedList(head);
        System.out.println("Just head:");
        list.printList();

        System.out.println();
        System.out.println("After adding to the beginning:");
        list.add("hello");
        list.printList();

        System.out.println();
        System.out.println("After adding to the tail:");
        list.pushToTail("world");
        list.printList();

        System.out.println();
        System.out.println("After removing the last:");
        list.removeLast();
        list.printList();

        System.out.println();
        System.out.println("After removing the first:");
        list.removeFirst();
        list.printList();
    }
}
