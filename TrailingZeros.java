/*
Me Bean is very good in mathematics. He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) . Can you help him?

Sample Input
5
Sample Output
1
Explanation
5! (Factorial) is 120, so there is one trailing zero.

Implement it by using loop
 */

public class TrailingZeros {
    public void trailingZeros(int n){
        int c = 0;
        while (n>=5){
            n = n/5;
            c = c+n;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        TrailingZeros t1 = new TrailingZeros();
        t1.trailingZeros(100);
    }
}
