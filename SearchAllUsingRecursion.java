/*
Q6. Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print all the  occurrence(index) of search value(7) by holding the index in a result array . Do it recursively

The prototype of the method is as follows:-

public static int[] res(int arr[], int current index, int search_value)
{
	// set of statements;
}
 */

public class SearchAllUsingRecursion {
    public int count(int arr[],int  i, int value,int lst[]) {
        if (i == arr.length) {
            return 0;
        }
        int s = count(arr, i + 1, value,lst);
        int c = arr[i];
        if (c == value) {
            lst[s] = i;
            s =  1 + count(arr, i + 1, value,lst);
        }

        return s;
    }

    public int[] searchAll(int arr[],int i,int value){
        int lst[] = new int[arr.length];
        int c = count(arr,i,value,lst);
        int lst1[] = new int[count(arr,i,value,lst)];
        count(arr,i,value,lst1);
        return lst1;
    }

    public static void main(String[] args) {
        SearchAllUsingRecursion s1 = new SearchAllUsingRecursion();
        int arr[] = {1,7,4,7,6};
        int c = s1.searchAll(arr,0,7).length;
        for (int i = 0; i < c; i++) {
            System.out.print(s1.searchAll(arr,0,7)[i] + " ");
        }
    }
}
