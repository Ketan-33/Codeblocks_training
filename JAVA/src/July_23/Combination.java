package July_23;

import java.util.*;
public class Combination {

    public static void combination(int n,int k,List<Integer> ll,List<List<Integer>> bl){
        if(k==0){
            bl.add(new ArrayList<>(ll));
            return;
        }
        if(n==0) return;
        combination(n-1,k,ll,bl);
        ll.add(n);
        combination(n-1,k-1,ll,bl);
        ll.remove(ll.size()-1);
    }

    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> bl=new ArrayList<>();
        combination(4,2,ll,bl);
        System.out.println(bl);
    }
    
}
