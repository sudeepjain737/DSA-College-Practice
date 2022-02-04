/*
Length Of LL

For a given singly linked list of integers, find and return its length. Do it using an iterative method.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the length of the linked list.

Output for every test case will be printed in a separate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
Sample Output 1 :
7
Sample Input 2 :
2
10 76 39 -3 2 9 -23 9 -1
-1
Sample Output 2 :
8
0
 */
package LinkedList;

import java.util.Scanner;

public class SizeOfALinkedList {
    Node head;
    int size;
    SizeOfALinkedList(){
        head = null;
        size = 0;
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
            SizeOfALinkedList obj = new SizeOfALinkedList();
            int c = 0;
            int n = input.nextInt();
            while (n != -1) {
                obj.insert(n);
                c = c + 1;
                n = input.nextInt();
            }
            System.out.println(c);
//            System.out.println(obj.size);          //   Same Answer
        }
    }
}
