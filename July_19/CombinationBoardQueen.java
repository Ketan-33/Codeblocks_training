// package July_19;

public class CombinationBoardQueen {
    public static void main(String[] args) {
        boolean arr[]=new boolean[4];
        Boardpath(arr, 0, 2, "",0);
    }
    public static void Boardpath(boolean arr[],int qpsf,int tq,String ans,int last){
        if(qpsf==tq){
            System.err.println(ans);
            return ;
 
        }
        for(int i=last;i<arr.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                
                Boardpath(arr,qpsf+1,tq,ans+" q"+qpsf+"b"+i,i+1);
                
                arr[i]=false; // backtracking step to reset the board state.
            }
        }
    }
}

