package miscellaneous;

public class WrapperClasses {
    public static void main(String args[]) {
   
	int num=100;  
	Integer obj=Integer.valueOf(num);  

    System.out.println(num + " " + obj);
    @SuppressWarnings("removal")

    
    Integer obj1 = new Integer(100);  
		
	int num1 = obj1.intValue();

	System.out.println(num1+ " "+ obj1);
   }
}
