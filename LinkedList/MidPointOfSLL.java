/*
Q.Mid Point Linked List

For a given singly linked list of integers, find and return the node present at the middle of the list.


Note : If the length of the singly linked list is even, then return the first middle node.

Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data values are, 20 and 30. We return the first node with data 20.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 Output Format :
For each test case/query, print the data value of the node at the middle of the given list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
3
Sample Input 2 :
2
-1
1 2 3 4 -1
Sample Output 2 :
2
 */

package LinkedList;

import java.util.Scanner;

public class MidPointOfSLL {
        Node head;
        int size;
        MidPointOfSLL(){
            head = null;
            size = 0;
        }

        public void midPoint(Node node) {
            if(node == null){
                return;
            }
            else {
                Node temp = node;
                Node mid = node;
                while (temp.next != null && temp.next.next != null ){
                    temp = temp.next.next;
                    mid = mid.next;
                }
                System.out.println(mid.value);
            }
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
            MidPointOfSLL obj = new MidPointOfSLL();
            int n = input.nextInt();
            while (n != -1){
                obj.insert(n);
                n = input.nextInt();
            }
            obj.midPoint(obj.head);
        }
    }
}
