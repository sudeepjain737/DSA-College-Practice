/*
Q. Write a program to input the elements of a two- dimensional array.
Then from this array, make two arrays one that stores all odd elements of the two-dimensional array and
the other that stores all even elements of the array.
Note:-  Resulting arrays will be of ArrayList type
 */

import java.util.ArrayList;

public class OddEven {
    public void oddEven(int arr[][]){
        ArrayList<Integer>arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 !=0 ){
                    arr1.add(arr[i][j]);
                }
                else {
                    arr2.add(arr[i][j]);
                }
            }
        }
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(arr2.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        OddEven o1 = new OddEven();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        o1.oddEven(arr);
    }
}
