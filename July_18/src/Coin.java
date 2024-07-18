
public class Coin {
    public static void main(String[] args) {
        cointoss(3,"");
        }
        public static void cointoss(int n, String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        if(s.length()==0 || s.charAt(s.length()-1)!='H'){
            cointoss(n-1,s+"H");
        }
            cointoss(n-1,s+"T");
        
      
    }
    }
