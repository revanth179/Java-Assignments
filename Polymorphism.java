class Animal{

    void makesSound(){
        System.out.println(("Animala makes sound"));
    }
}
class Dog extends Animal{
    @Override
    void makesSound(){
        System.out.println("Dog makes barks");
    }
}

class Cat extends Animal{
    @Override
    void makesSound(){
        System.out.println("Cat Meows");

    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.makesSound();
        b.makesSound();
    }
    
}
