package javaio;

import java.io.File;
public class DeleteFileExample
{
   public static void main(String[] args)
   {	
      try{
        
    	 File file = new File("C:\\Users\\Sree's TUF\\newfile.txt");
      
    	 if(file.delete()){
    	    System.out.println(file.getName() + " is deleted!");
         }else{
    	    System.out.println("Delete failed: File didn't delete");
    	  }
       }catch(Exception e){
           System.out.println("Exception occurred");
    	   e.printStackTrace();
    	}
    }
}