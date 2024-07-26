package stackk;

import java.util.Stack;

public class Validparenthesis {
    public static void main(String[] args) {
        String s="(){}";
        isValid(s);
    }
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='(' ||s.charAt(i)=='[' || s.charAt(i)=='{'){
               st.push(s.charAt(i));
           }
           else {
               if(st.isEmpty())return false;
               if(s.charAt(i)==')'&&s.charAt(i)!='(' || s.charAt(i)==']'&&s.charAt(i)!='[' || s.charAt(i)=='}'&&s.charAt(i)!='{'){
                   return false;
               }
               st.pop();
           }
       }
        return false;
    }
}
