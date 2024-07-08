package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]) {

      HashMap<Integer,String> hMap=new HashMap<>();
    hMap.put(101,"Cricket");
    hMap.put(102,"Hockey");
    hMap.put(103,"Basketball");

    System.out.println("HashMap elements: ");
    for(@SuppressWarnings("rawtypes") Map.Entry mEntry : hMap.entrySet()){
      System.out.print("key: "+ mEntry.getKey() + " & Value: ");
      System.out.println(mEntry.getValue());
    }

   }
}
