package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {
   
      ArrayList<String> obj = new ArrayList<String>();

      obj.add("Apples");
      obj.add("Oranges");
      obj.add("Mango");
      obj.add("Kiwi");
      obj.add("Melon");

      
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);


      obj.add(0, "Banana");
      obj.add(1, "Pineapple");

      System.out.println("ArrayList after add operation:");
      for(String str:obj)
         System.out.println(str);


      obj.remove("Mango"); 
      obj.remove("Kiwi"); 

      // Displaying elements
      System.out.println("ArrayList after remove operation:");
      for(String str:obj)
         System.out.println(str);

      obj.remove(1); 

      System.out.println("Final ArrayList:");
      for(String str:obj)
         System.out.println(str);
   }
}
