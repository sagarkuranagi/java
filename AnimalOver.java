
class Animal{
public void makeSound(){
    System.out.println("animal making Sound");
}
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
public class AnimalOver {
     public static void main(String[] args) {
        // Dog myDog = new Dog();
        // myDog.makeSound();
        Animal a = new Dog();
        a.makeSound();
        
        Cat myCat = new Cat();
        myCat. makeSound();
    }
}
