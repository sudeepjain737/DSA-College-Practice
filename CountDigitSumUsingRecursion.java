/*
Q4. Write a program to find and return the sum of all elements of the array. Do this recursively.

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
 */

public class CountDigitSumUsingRecursion {
    public int sum(int[] arr,int i){
        if(i >= arr.length){
            return 0;
        }
        return arr[i] + sum(arr,i+1);
    }

    public static void main(String[] args) {
        CountDigitSumUsingRecursion c1 = new CountDigitSumUsingRecursion();
        System.out.println(c1.sum(new int[]{9,8,9},0));
        System.out.println(c1.sum(new int[]{4,2,1},0));
    }
}
