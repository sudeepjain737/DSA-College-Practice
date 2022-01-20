/*
Q.Write a program to find whether the array of integers contains a duplicate number.
if yes print the location where duplicate numbers are found.
 */

import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateNumbers {
    public void duplicate(int arr[]) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        List<Integer> lst = s.stream().toList();
        if (lst.size() == arr.length) {
            System.out.println("No, There are no duplicate elements in the array");
        } else {
            System.out.print("Positions of Duplicates number: ");
            for (int i = 0; i < lst.size(); i++) {
                int c = 0;
                for (int j = 1; j <= arr.length; j++) {
                    if (lst.get(i) == arr[j - 1]) {
                        c = c + 1;
                        if (c > 1) {
                            System.out.print(j + " ");
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        DuplicateNumbers d1 = new DuplicateNumbers();
        d1.duplicate(new int[]{1,2,3,2,1,4,5,2});
        System.out.println();
        d1.duplicate(new int[]{1,2,3});
    }
}
