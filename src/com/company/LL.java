package com.company;

public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }
    class Node{
       String data;
       Node next;

        Node(String data){     // Constructor
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add-first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    // print
    public void printList(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){   // head.next = null -> lastNode null , so we can't do null.next, that's why this condition comes
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public int getSize(){
        return size;
    }

    public void reverseListIterate(){  // Iterative method
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseListRecursive (Node head){
        // empty node || last node or only one node
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }





    public static void main(String[] args) {
        LL list = new LL();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printList();
//
//        list.addLast("list");
//        list.printList();
//
//        list.addFirst("this");
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
//
//        System.out.println(list.getSize());
       list.addLast("1");
       list.addLast("2");
       list.addLast("3");
       list.addLast("4");
        list.printList();

//        list.reverseListIterate();
//        list.printList();

       list.head = list.reverseListRecursive(list.head);
        list.printList();





    }
}
