/*
Q5. Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first occurrence(index) of search value. Do it recursively
The prototype of the method is as follows
public static int find(int arr[ ], int currentIndex, int search_value)
{
	// set of statements;
}
 */

public class SearchElementUsingRecursion {
    public int find(int arr[], int i , int value){
        if(i == arr.length){
            return -1;
        }
        int c = arr[i];
        if(c == value){
            return i;
        }
        else{
            return find(arr,i+1,value);
        }
    }

    public static void main(String[] args) {
        SearchElementUsingRecursion s1 = new SearchElementUsingRecursion();
        System.out.println(s1.find(new int[]{1,2,4,2,6},0,2));
    }
}
