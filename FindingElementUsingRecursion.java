package Recursion;

/*
Q. Design a method that returns true if element n is a member of given array  and false if not  by using the recursion
 */

public class FindingElementUsingRecursion {
    public boolean find(int arr[],int n,int i){
        if(i == arr.length){
            return false;
        }
        if(arr[i] == n){
            return true;
        }
        else {
            return find(arr,n,i+1);
        }
    }

    public static void main(String[] args) {
        FindingElementUsingRecursion obj = new FindingElementUsingRecursion();
        int arr[] = new int[]{1,2,3,4,5};
        System.out.println(obj.find(arr,-5,0));
        System.out.println(obj.find(arr,4,0));
    }
}
