import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Declaration
        int M,N;
        Scanner sc=new Scanner(System.in);
        M=sc.nextInt();
        N=sc.nextInt();
        Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
        Map<Integer,Integer> map2=new HashMap<Integer,Integer>();
        LinkedHashMap<Integer,Integer> SortedMap=new LinkedHashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        //Initialization
        for(int i1=0;i1<M;i1++) {
            int key=sc.nextInt();
            int value=sc.nextInt();
            if(map1.containsKey(key) && map1.get(key)<value) {
                continue;
            }
            map1.put(key,value);
        }
        for(int i2=0;i2<N;i2++) {
            int key=sc.nextInt();
            int value=sc.nextInt();
            if(map2.containsKey(key) && map2.get(key)<value) {
                continue;
            }
            map2.put(key,value);
        }
        //merge acc to smaller value
        map2.forEach((key,value) -> map1.merge(key,value, (oldValue,newValue) -> {
            if(oldValue<newValue) {
                return oldValue;
            }
            else {
                return newValue;
            }
        }));
        //sorting acc to values
        for(Map.Entry<Integer,Integer> mp1:map1.entrySet()) {
            list.add(mp1.getValue());
        }
        Collections.sort(list);
        for(int num:list) {
            for(Map.Entry<Integer,Integer> mp1:map1.entrySet()) {
                if (mp1.getValue().equals(num)) {
                    SortedMap.put(mp1.getKey(), num);
                }
            }
        }
        //printing
        for(Map.Entry mp2:SortedMap.entrySet()) {
            System.out.println(mp2.getKey()+" "+mp2.getValue());
        }
    }
}
