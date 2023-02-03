
package com.telran.linkedlist;

public class MyLinkedList {

    private Node head;

    public MyLinkedList(Node head) {
        this.head = head;
    }


    public void add(String s) {
        // create new node with s
        Node current = new Node();
        current.setData(s);
        // set new head to the new node
        Node previousHead = head; //предыдущая голова
        head = current;  //
        // set previous head as next of new head
        head.setNext(previousHead);
    }

    // head -> Node(data = "hello", next = anotherNode), anotherNode = Node("world", null)
    // current -> Node(data = null, next = null)
    // current -> Node(data = s, next = null)
    // previousHead -> head  ( Node(data = "hello", next = anotherNode), anotherNode = Node("world", null) )
    // head -> current ( Node(data = s, next = null) )
    // head -> ( Node(data = s, next = previousHead) )

    public void pushToTail(String s) {
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        Node current = new Node();
        current.setData(s);
        last.setNext(current);
    }

    // head -> elem1 -> elem2 -> null
    // last = head
    // head.getNext != null = true
    // last = elem1 (head.getNext)
    // elem1.getNext != null = true
    // last = elem2 (elem1.getNext)
    // elem2.getNext != null = false
    // end of while

    public void printList() {
        Node node = head;
        do {
            System.out.println(node.getData());
            node = node.getNext();
        } while (node != null);
    }

    public void removeFirst() {
        Node node = head.getNext();
        head = node;
    }


    public void removeLast() {
        Node node = head;
        while(node.getNext().getNext() != null){
            node = node.getNext();
        }
        node.setNext(null);
    }

    public int size() {
        int element = 0;
        Node nodeElement = head;
        while (nodeElement != null){
            nodeElement = nodeElement.getNext();
            element++;
        }
        return element;
    }

}
