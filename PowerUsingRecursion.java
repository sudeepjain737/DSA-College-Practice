/*
Q1. Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
 */

public class PowerUsingRecursion {
    public int power(int x , int n){
        if(n == 0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        PowerUsingRecursion p1 = new PowerUsingRecursion();
        System.out.println(p1.power(3,4));
    }
}
