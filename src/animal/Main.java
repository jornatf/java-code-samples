package animal;

public class Main {
  public static void main(String[] args) {
    // Define 2 animals
    Cat cat = new Cat("Lucky", 2);
    Dog dog = new Dog("Roger", 4);

    // Display total animals
    System.out.println("There are " + Animal.count + " animal(s)");

    // Random actions
    cat.meow();
    dog.bark();
    cat.eat();
    dog.move();
    cat.move();
    dog.bark();
    dog.eat();
  }
}
