import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n){
        List<String> list = new ArrayList<>();
        solve(n, 0, 0, "", list);
        return list;
    }
    public static void solve(int n, int open, int close, String s,List<String> list) {
        // List<String> list = new ArrayList<>();
        // String s="";
        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }
        
        if(open<n)solve(n,open+1,close,s+"(",list);
        if(close<open)solve(n,open,close+1,s+")",list);
        
    }
}
