public class Permutation {

    static int arr[]={1,2,3};
    public static void main(String[] args) {
        permutation(arr,"");
    }
    public static void permutation(int []arr,String ans) {
        if(arr.length==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++){
            int[] newArr = new int[arr.length - 1];
            for (int j = 0, k = 0; j < arr.length; j++) {
                if (j != i) {
                    newArr[k++] = arr[j];
                }
            }
            permutation(newArr, ans + arr[i]);
        }
    }
        
}
