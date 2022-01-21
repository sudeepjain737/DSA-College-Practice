/*
Q3. Write a program to find out and return the number of digits present in a number recursively.

Sample Input 1 :
156
Sample Output 1 :
3
Sample Input 2 :
7
Sample Output 2 :
1
 */

public class CountDigitsUsingRecursion {
    public int countDigits(int n){
        if(n <= 0){
            return 0;
        }
        return 1 + countDigits(n/10);

    }

    public static void main(String[] args) {
        CountDigitsUsingRecursion c1 = new CountDigitsUsingRecursion();
        System.out.println(c1.countDigits(156));
        System.out.println(c1.countDigits(7));
        System.out.println(c1.countDigits(90));
    }
}
