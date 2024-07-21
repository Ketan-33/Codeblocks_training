// package July_19;

public class BoardQueen {
    public static void main(String[] args) {
        boolean arr[]=new boolean[4];
        Boardpath(arr, 0, 2, "");
    }
    public static void Boardpath(boolean arr[],int qpsf,int tq,String ans){
        if(qpsf==tq){
            System.err.println(ans);
            return ;
 
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                // if(i<qpsf)break;
                Boardpath(arr,qpsf+1,tq,ans+" q"+qpsf+"b"+i);
                
                arr[i]=false; // backtracking step to reset the board state.
            }
        }
    }
}
