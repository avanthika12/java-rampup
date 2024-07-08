package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressingFile {
    public static void main( String[] args )
  {
    CompressingFile zipObj = new CompressingFile();
    zipObj.gzipMyFile();
  }
 
  public void gzipMyFile(){ 
    byte[] buffer = new byte[1024];
    try{
      
      GZIPOutputStream gos = 
       new GZIPOutputStream(new FileOutputStream("C:\\Users\\Sree's TUF\\Documents\\demo.gz"));
 
      FileInputStream fis = 
       new FileInputStream("C:\\Users\\Sree's TUF\\Documents\\demo.txt");
 
      int length;
      while ((length = fis.read(buffer)) > 0) {

        gos.write(buffer, 0, length);
      }
 
      fis.close();
      gos.finish();
      gos.close();
 
      System.out.println("File Compressed!!");
 
    }catch(IOException ioe){
        ioe.printStackTrace(); 
     }
  }
}
