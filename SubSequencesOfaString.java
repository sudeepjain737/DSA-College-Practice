public class SubSequencesOfaString {
    public void subSequences(String target,String str){
        if(str.length() == 0){
            System.out.println(target);
            return;
        }
        subSequences(target+str.charAt(0),str.substring(1));
        subSequences(target,str.substring(1));
    }

    public static void main(String[] args) {
        SubSequencesOfaString s1 = new SubSequencesOfaString();
        s1.subSequences("","abc");
    }
}
