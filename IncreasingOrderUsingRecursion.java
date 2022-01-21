/*
Q2. Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */

public class IncreasingOrderUsingRecursion {
    public void IncreasingOrder(int n){
        if(n <= 0){
            return;
        }
        IncreasingOrder(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        IncreasingOrderUsingRecursion i1 = new IncreasingOrderUsingRecursion();
        i1.IncreasingOrder(6);
    }
}
