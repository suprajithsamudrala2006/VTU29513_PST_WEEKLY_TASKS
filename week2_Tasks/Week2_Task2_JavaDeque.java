import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int sub = sc.nextInt();
        int maxDistinct=0;
        
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            deque.addLast(num);
            map.put(num,map.getOrDefault(num,0)+1);
            if (deque.size()>sub){
                int removed=deque.removeFirst();
                map.put(removed,map.get(removed)-1);
                if(map.get(removed)==0){
                    map.remove(removed);
                }
            }
            if(deque.size()==sub){
                maxDistinct=Math.max(maxDistinct,map.size());
            }
            
            
                
            }
            System.out.println(maxDistinct);
            
        
        
            
    }
}
