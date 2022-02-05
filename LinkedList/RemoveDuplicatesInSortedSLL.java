package LinkedList;

/*
Q. In a sorted linked list (elements are sorted in ascending order),
eliminate duplicates from the given linked list,
 such that output linked list contains only unique elements.

 */

public class RemoveDuplicatesInSortedSLL {
    Node head;
    int size;
    RemoveDuplicatesInSortedSLL(){
        head = null;
        size = 0;
    }

    public void remove(Node node){
        Node temp = head;
        while (temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
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
        RemoveDuplicatesInSortedSLL obj = new RemoveDuplicatesInSortedSLL();
        obj.insert(1);
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(4);
        obj.insert(5);
        obj.insert(5);
        System.out.print("Original Linked List: ");
        obj.display();
        obj.remove(obj.head);
        System.out.print("Linked List after Removing Duplicates: ");
        obj.display();
    }
}
