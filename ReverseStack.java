package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public void reverse(Stack<Integer>s1,Stack<Integer>s2){
        while (s1.isEmpty() == false){
            s2.push(s1.pop());
        }
    }

    public static void main(String[] args) {
        ReverseStack obj = new ReverseStack();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            s1.push(input.nextInt());
        }
        obj.reverse(s1,s2);
        for (int i = 0; i < n; i++) {
            System.out.print(s2.pop() + " ");
        }
    }
}
