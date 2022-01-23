/*
Q. In a string S, remove consecutive duplicates from it recursively.

Sample Input 1 :
aabccba
Sample Output 1 :
abcba
 */

public class RemoveConsecutiveDuplicateUsingRecursion {
    public String removeDuplicates(String s,int i){
        if(i == s.length()-1) {
            return "" + s.charAt(i);
        }
        if(s.charAt(i) != s.charAt(i+1)){
            return ""+s.charAt(i)+removeDuplicates(s,i+1);
        }
        return ""+removeDuplicates(s,i+1);
    }

    public static void main(String[] args) {
        RemoveConsecutiveDuplicateUsingRecursion r1 = new RemoveConsecutiveDuplicateUsingRecursion();
        System.out.println(r1.removeDuplicates("aabccbaaaaaabbbaa",0));
    }
}
