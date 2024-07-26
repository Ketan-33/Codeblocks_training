package July_23;//  package July_19;

public class CombinationSum {
    static int arr[]={1,2,3,4,5};
    public static void main(String[] args) {
        int a=6;
        // coinCombination(arr,0,a,"");
        // coinCombination(arr,0,a,"");
        coinCombination(arr, 0,a,"");
        
    }
    public static void coinCombination(int []arr,int cur,int tar,String ans){
        if(cur==tar){
            System.out.println(ans);
            return;
        }
        if(cur>tar){
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(cur+arr[i]<=tar){
                
                coinCombination(arr,cur+arr[i],tar,ans+arr[i]);
            }
        }
    }

    // public static void coinCombinationBackTrack(int []arr,int cur,int tar,String ans){
    //     if(cur==tar){
    //         System.out.println(ans);
    //         return;
    //     }
    //     if(cur>tar){
    //         return;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         cur+=arr[i];
    //         coinCombination(arr,cur+arr[i],tar,ans+arr[i]);
    //         cur-=arr[i];
            
    //     }
    // }

    // public static void coinCombinationLimited(int[] arr, int cur, int tar, String ans){
    //     if(cur==tar){
    //         System.out.println(ans);
    //         return;
    //     }
    //     if(cur>tar){
    //         return;
    //     }
    //     for(int i=start;i<arr.length;i++){
    //         if(cur+arr[i]<=tar){
                
    //             coinCombinationLimited(arr,cur+arr[i],tar,ans+arr[i],i+1);
    //         }

    //     }

    // }
}
