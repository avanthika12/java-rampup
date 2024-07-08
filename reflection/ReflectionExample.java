package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class ReflectionExample {
    public static void main(String[] args) {
        try {
            
            Class<?> personClass = Class.forName("reflection.Person");

        
            Class<?> personClass2 = Person.class;

            
            Constructor<?> constructor = personClass.getConstructor();
            Object personInstance = constructor.newInstance();

            
            Class<?> personClass3 = personInstance.getClass();

            
            System.out.println("Class obtained using forName: " + personClass.getName());
            System.out.println("Class obtained using .class syntax: " + personClass2.getName());
            System.out.println("Class obtained using getClass: " + personClass3.getName());

            
            Method printDetailsMethod = personClass.getDeclaredMethod("printDetails");

            printDetailsMethod.invoke(personInstance);

            
            Method privateMethod = personClass.getDeclaredMethod("privateMethod");
            privateMethod.setAccessible(true);
            privateMethod.invoke(personInstance);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
