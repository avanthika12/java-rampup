package reflection;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Default Name";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @SuppressWarnings("unused")
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
