// package July_23;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcaba";
        System.out.println(isPalindrome(str));
    }
    public static String isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return "Not Palindrome";
            }
            i++;
            j--;
        }
        return "Palindrome";
    }
}
