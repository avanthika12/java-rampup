package generics;

public class GenericsClass<T>{  
    T obj;

    void add(T obj) {
        this.obj = obj;
    }  

    T get() {
        return obj;
    }
        
    public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  

    public static void main(String args[]) {
        GenericsClass<Integer> m=new GenericsClass<Integer>();  
        m.add(2);   
        System.out.println(m.get());  
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };  
  
        System.out.println( "Printing Integer Array" );  
        printArray( intArray  );   
  
       System.out.println( "Printing Character Array" );  
        printArray( charArray );   
    }   
    }
