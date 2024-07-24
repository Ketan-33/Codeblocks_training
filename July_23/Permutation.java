
import java.util.*;

// package July_23;

public class Permutation {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        List<Integer>ll=new ArrayList<>();
        List<List<Integer>>nn=new ArrayList<>();
        boolean[]check=new boolean[arr.length];
        ans(arr,ll,check,nn);
        System.out.println(nn);
    }

public static void ans(int []arr,List<Integer>ll,boolean []check,List<List<Integer>>nn){
        if(ll.size()==arr.length){
            // System.out.println(ll);
            List<Integer>mn=new ArrayList<>(ll);
            nn.add(mn);
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(check[i]==false){
                check[i]=true;
                ll.add(arr[i]);
                ans(arr,ll,check,nn);
                check[i]=false;
                ll.remove(ll.size()-1);
            }
    }
}
// public static void ans(int []arr,List<Integer>ll,boolean []check,int last){
//     if(ll.size()==arr.length){
//         System.out.println(ll);
//         return;
//     }

//     for(int i=last;i<arr.length;i++){
//         if(check[i]==false){
//             check[i]=true;
//             ll.add(arr[i]);
//             ans(arr,ll,check,last+1);
//             check[i]=false;
//             ll.remove(ll.size()-1);
//         }
}

