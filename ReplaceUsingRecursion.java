/*
Q. Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 with character c2 in the given string. Do this recursively.

Sample Input :
abaca
a x
Sample Output :
xbxcd
 */

public class ReplaceUsingRecursion {

//                   Using Char Array

    public String replaceAll1(String s,char a,char b , int i){
        char[] c = s.toCharArray();
        if(i == s.length()){
            return s;
        }
        if(c[i] == a){
            c[i] = b;
            s = String.valueOf(c);
        }
        return replaceAll1(s,a,b,i+1);
    }

//                   Without Using Array

    public String replaceAll(String s,char a, char b,int i){
        if (i == s.length()){
            return "";
        }
        if(s.charAt(i) == a){
           return  ""+b+replaceAll(s,a,b,i+1);
        }
        return ""+s.charAt(i)+replaceAll(s,a,b,i+1);
    }

    public static void main(String[] args) {
        ReplaceUsingRecursion r1 = new ReplaceUsingRecursion();
        System.out.println(r1.replaceAll1("abaca",'a','x',0));
        System.out.println(r1.replaceAll("abaca",'a','x',0));
    }
}
