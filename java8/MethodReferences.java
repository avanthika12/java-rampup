package java8;
//import java.lang.reflect.Method;
import java.util.function.BiFunction;  

@FunctionalInterface
interface MyInterface1 {
    void display();
}

@FunctionalInterface 
interface MyInterface2{  
    Hello display(String say);  
}  

class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
public class MethodReferences {
    public void myMethod() 
    {  
	System.out.println("Instance Method");  
    }  

    public static void main(String[] args) {
    //1) Method reference to an instance method of an object
	MethodReferences obj = new MethodReferences();   
	
	MyInterface1 ref = obj::myMethod;  
	 
    ref.display();

    //2) Method reference to a static method of a class
    BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
	int pr = product.apply(11, 5);  
    System.out.println("Product of given number is: " + pr);
    
    //3) Method reference to a Constructor
    MyInterface2 ref1 = Hello::new;  
        ref1.display("Hello World!");  
    }  
}
