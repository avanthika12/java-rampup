package java8;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {  
    	
        StringJoiner mystring = new StringJoiner(",");   
          
        mystring.setEmptyValue("This is a default String");
        
        System.out.println("Default String: "+mystring);  
          
          
        // Adding strings to StringJoiner  
        mystring.add("Apple");  
        mystring.add("Banana"); 
        mystring.add("Orange");
        mystring.add("Kiwi");
        mystring.add("Grapes");
        System.out.println(mystring);  
          
        
        int length = mystring.length();  
        System.out.println("Length of the StringJoiner: "+length);  
         
    }  
}
