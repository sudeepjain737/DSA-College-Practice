/*
Q. Palindrome LinkedList

You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1
 */

package LinkedList;

import java.util.Scanner;

public class PalindromicSLL {
    Node head;
    int size;

    PalindromicSLL() {
        head = null;
        size = 0;
    }

    public boolean palindrome(Node node) {
        if(node == null){
            return false;
        }
        for (int i = 0; i < size / 2; i++) {
            Node temp = node;
            for (int j = i; j < size - i - 1; j++) {
                temp = temp.next;
            }
            if (temp.value != node.value) {
                return false;
            }
            node = node.next;
        }
        return true;
    }

    public void insert(int n) {
        Node newNode = new Node();
        newNode.value = n;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size = size + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            PalindromicSLL obj = new PalindromicSLL();
            int n = input.nextInt();
            while (n != -1) {
                obj.insert(n);
                n = input.nextInt();
            }
            System.out.println(obj.palindrome(obj.head));
        }
    }
}
