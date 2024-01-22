package animal;

/**
 * Create a Dog defining a name and an age.
 */
public class Dog extends Animal {
  public Dog(String name, int age) {
    super(name, age);
    this.type = "dog";
    printAnimal();
  }

  public void bark() {
    System.out.println("Woof!");
  }
}
