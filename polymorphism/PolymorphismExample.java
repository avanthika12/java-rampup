package polymorphism;
class CP
{
    void add (int a)
    {
       System.out.println ("a: " + a);
    }
    void add (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double add(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}

public class PolymorphismExample {
        public static void main (String args [])
    {
        CP Obj = new CP();
        double result;
        Obj .add(10);
        Obj .add(10, 20);
        result = Obj .add(5.5);
        System.out.println("O/P : " + result);
    }
}
