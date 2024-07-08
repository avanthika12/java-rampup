package constructor;


class Employee {

   int empId;  
   String empName;  
	    
   public Employee() {
       this(101, "James");
   }

   public Employee(int id, String name) {
       this.empId = id;
       this.empName = name;
   }

   public Employee(Employee emp) {
       this.empId = emp.empId;
       this.empName = emp.empName;
   }
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }     
}

public class ConstructorExample {
    public static void main(String args[]) {
    Employee obj = new Employee();   
    Employee obj2 = new Employee(92232, "John");
    Employee obj3 = new Employee(obj2);
    
    obj.info();
    obj2.info();
    obj3.info();
   }  
}


