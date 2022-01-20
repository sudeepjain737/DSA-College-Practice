/*
Q. Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

Example

Imagine the size of both the arrays are 5

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2
 */

public class TwoUnsortedArray {
    public void count(int arr1[] , int arr2[]){
        for (int i = 0; i < arr1.length; i++) {
            int c = 0;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] <= arr2[j]){
                    c = c+1;
                }
            }
            System.out.print(c + ",");
        }
    }

    public static void main(String[] args) {
        TwoUnsortedArray t1 = new TwoUnsortedArray();
        int arr1[] = {3,4,1,2,2};
        int arr2[] = {1,2,1,3,1};
        t1.count(arr1,arr2);
    }
}
