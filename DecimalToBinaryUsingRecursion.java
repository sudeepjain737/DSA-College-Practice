package Recursion;

/*
Q. Write a recursive function to convert a decimal no into a binary no, print the binary number.
 */

public class DecimalToBinaryUsingRecursion {
    public void decimalToBinary(int n){
        if(n <= 0){
            return;
        }
        decimalToBinary(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        DecimalToBinaryUsingRecursion obj = new DecimalToBinaryUsingRecursion();
        obj.decimalToBinary(100);
    }
}
