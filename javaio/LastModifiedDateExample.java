package javaio;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDateExample {
    public static void main(String[] args)
    {	
    
	File file = new File("C:\\Users\\Sree's TUF\\newfile.txt");
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
    }
}
