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
