/*
Q. Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.

Sample Input 1 :
abb
Sample Output 1 :
true
Sample Input 2 :
abababa
Sample Output 2 :
false
 */

public class StringPatternUsingRecursion {
    public boolean stringPattern(String s,int i ){
        if(s.length() == 0){
            return false;
        }
        if(i == s.length()){
            return true;
        }
        if(s.charAt(0) != 'a'){
            return false;
        }
        else{
            if(s.charAt(i) == 'a'){
                return stringPattern(s,i+1);
            }
            if(s.charAt(i) != 'a' && i == s.length()-1){
                return false;
            }
            if(s.substring(i,i+2).equals("bb")) {
                    return stringPattern(s, i + 2);
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        StringPatternUsingRecursion s1 = new StringPatternUsingRecursion();
        System.out.println(s1.stringPattern("abbabb",0));
    }
}

