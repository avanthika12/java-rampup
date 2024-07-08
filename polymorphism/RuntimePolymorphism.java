package polymorphism;
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);  
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println(name + " barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
    
        Animal animal = new Animal("Generic Animal");
        animal.speak();  

        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.speak(); 
    }
}
