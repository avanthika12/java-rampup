package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String args[]) {
        
         LinkedHashMap<Integer, String> lhmap = 
                 new LinkedHashMap<Integer, String>();

         lhmap.put(22, "Abey");
         lhmap.put(33, "Dawn");
         lhmap.put(1, "Sherry");
         lhmap.put(2, "Karon");
         lhmap.put(100, "Jim");

         
         Set<Map.Entry<Integer, String>> set = lhmap.entrySet();

         
         Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
         while(iterator.hasNext()) {
            Map.Entry<Integer, String> me = iterator.next();
            System.out.print("Key is: "+ me.getKey() + 
                    "& Value is: "+me.getValue()+"\n");
         }
    }
}
