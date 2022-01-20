/*
 Write a short Java function that takes an array of int values  as an argument and
  determines if there is a pair of numbers in the array whose product is odd.
 */

public class OddProduct {
    public void oddProduct(int arr[]) {
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] * arr[j]) % 2 != 0) {
                    c = 1;
                    break;
                }
            }
            if (c == 1) {
                break;
            }
        }
        if (c == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        OddProduct o1 = new OddProduct();
        int arr[] = {2,2,3};
        o1.oddProduct(arr);
    }
}
