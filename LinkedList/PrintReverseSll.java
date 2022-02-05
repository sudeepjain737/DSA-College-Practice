/*
Q. Print Reverse LinkedList

You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
Note :
You can’t change any of the pointers in the linked list, just print it in the reverse order.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Constraints :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the singly linked list of integers in a reverse fashion, in a row, separated by a single space.

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^3
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
5 4 3 2 1
Sample Input 2 :
2
1 2 3 -1
10 20 30 40 50 -1
Sample Output 2 :
3 2 1
50 40 30 20 10

Note:- try to solve this problem by using the iterative statement  and recursive statement
 */

package LinkedList;

import java.util.Scanner;

public class PrintReverseSll {
    Node head;
    int size;
    PrintReverseSll(){
        head = null;
        size = 0;
    }

    public void printReverse(Node node) {
        if (node == null) {
            return;
        }
        printReverse(node.next);
        System.out.print(node.value + " ");
    }

    public void printReverseIteratively(Node node){
        for (int i = 0; i < size; i++) {
            Node temp = node;
            for (int j = 0; j < size-i-1; j++) {
                temp = temp.next;
            }
            System.out.print(temp.value + " ");
        }
        System.out.println();
    }

    public void insert(int n){
        Node newNode = new Node();
        newNode.value = n;
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size = size+1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            PrintReverseSll obj = new PrintReverseSll();
            int n = input.nextInt();
            while (n != -1){
                obj.insert(n);
                n = input.nextInt();
            }
            obj.printReverse(obj.head);
            System.out.println();
//            obj.printReverseIteratively(obj.head);
        }
    }
}
