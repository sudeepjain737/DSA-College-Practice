/*
Q. A child is running up a staircase with N steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run-up to the stairs. You need to return the number of possible ways W.

Sample Input :
4
Sample Output  :
7
*/

public class StairWaysUsingRecursion {
    public int noOfWays(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return noOfWays(n-1)+noOfWays(n-2)+noOfWays(n-3);
    }

    public static void main(String[] args) {
        StairWaysUsingRecursion s1 = new StairWaysUsingRecursion();
        System.out.println(s1.noOfWays(4));
    }
}
