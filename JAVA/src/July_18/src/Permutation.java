public class Permutation {
    public static void main(String[] args) {
        permutation("abc","" );
    }
    public static void permutation(String que,String ans) {
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<que.length();i++){

            permutation(que.substring(0,i)+que.substring(i+1),ans+que.charAt(i));
        }
    }
        
}
