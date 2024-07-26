package July_23;// package July_23;
import java.util.*;
public class PalindromePartitioning {
    public static void main(String[] args) {
        String str = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ss = new ArrayList<>();
        partition(str,"",ll,ss);
        System.out.println(ss);
        
    }
    public static void partition(String que,String ans,List<String> ll,List<List<String>> ss){
        if(que.length()==0){
            List<String> mn=new ArrayList<>(ll);
            ss.add(mn);
            return;
        }
        for(int i=1;i<=que.length();i++){
            String s=que.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                partition(que.substring(i),ans,ll,ss);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
