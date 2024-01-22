package animal;

public class Main {
  public static void main(String[] args) {
    // Define 2 animals
    Cat cat = new Cat("Lucky", 2);
    Dog dog = new Dog("Roger", 4);

    // Display total animals
    System.out.println("There are " + Animal.getCount() + " animal(s)");

    // Random actions
    cat.communicate();
    dog.communicate();
    cat.eat();
    dog.move();
    cat.move();
    dog.communicate();
    dog.eat();
  }
}
