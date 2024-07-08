package javaio;

import java.io.*;
public class ReadFileExample {
    public static void main(String[] args) {
    
      File file = new File("C:\\Users\\Sree's TUF\\newfile.txt");
      BufferedInputStream bis = null;
      FileInputStream  fis= null;

      try
      {
          fis = new FileInputStream(file);

          bis = new BufferedInputStream(fis);

          while (bis.available() > 0) {
              System.out.print((char) bis.read());
          }
          System.out.println("Read file successfully");

       }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe); 
        }
        finally
        {
            try{
               if(bis != null && fis!=null)
               {
       	          fis.close();
                  bis.close();
               }      
             }catch(IOException ioe)
              {
                  System.out.println("Error in InputStream close(): " + ioe);
              }         
        }
   }    
}