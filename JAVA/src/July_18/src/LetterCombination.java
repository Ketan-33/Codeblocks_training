import java.util.*;

public class LetterCombination {
        static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
    public static void main(String[] args) {
        List<String>ll=new ArrayList<>();
        letterCombinations("23","",ll);
        


    }

    public static void letterCombinations(String digits,String ans,List<String>ll){
        if(digits.length()==0){
            ll.add(ans);
            return;
        }

        char ch=digits.charAt(0);
        String keypress=key[ch-'0'];
        for(int i=0;i<keypress.length();i++){
          letterCombinations(digits.substring(1),ans+keypress.charAt(i),ll);
        }
    }
}
