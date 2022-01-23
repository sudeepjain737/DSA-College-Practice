/*
Q. write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into a corresponding integer and return the answer.

Sample Input:
“2029”

Sample Output:
2029
 */

public class StringToIntegerUsingRecursion {
    public int integer(String s ,int i){
        int c = 0;
        if(i == s.length()){
            return 0;
        }
        return c+(Integer.parseInt(String.valueOf(s.charAt(i)))*(int)Math.pow(10,s.length()-i-1))+integer(s,i+1);
    }

    public static void main(String[] args) {
        StringToIntegerUsingRecursion s1 = new StringToIntegerUsingRecursion();
        System.out.println(s1.integer("2029",0));
    }
}
