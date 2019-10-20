package com.hackerrank.practice.datastructures.linkedlists;

import java.io.IOException;
import java.util.Scanner;

public class InsertNodeAtTheTailOfALinkedList {


    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {

        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            node = node.next;
            if (node != null) {
                System.out.println(node.data);
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        if (head == null) {
            head = new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode current = head;
            // walk down the list
            while (current.next != null) {
                current = current.next;
            }
            // now current is going to going to be the end of the list and
            // have it's .next as null.  This is where we want to insert out new node
            current.next = new SinglyLinkedListNode(data);
        }
        return head;
    }




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

            llist.head = llist_head;
        }


        printSinglyLinkedList(llist.head);
        //bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
