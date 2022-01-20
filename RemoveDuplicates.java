/*
Q. Write a program to remove consecutive duplicate elements in an array.
Input values

10 10 30 30 40 50 50 50 9 45

Output

10 30 40 50 9 45
 */

public class RemoveDuplicates {
    public void removeConsecutiveDuplicate(int arr[]){
        int arr1[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                j = j+1;
                arr[j] = arr[i+1];
            }
        }

        for (int i = j+1; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] != arr[i+1]){
//                arr1[j] = arr[i];
//                j = j+1;
//            }
//        }
//        if(arr[arr.length-1] != arr[arr.length-2]){
//            arr1[j] = arr[arr.length-1];
//            j = j+1;
//        }
//        for (int i = 0; i < j; i++) {
//            System.out.print(arr1[i] + " ");
//        }
    }

    public static void main(String[] args) {
        RemoveDuplicates r1 = new RemoveDuplicates();
        int arr[] = {10,10,30,30,40,50,50,50,9,45};
        r1.removeConsecutiveDuplicate(arr);
    }
}
