package animal;

/**
 * Create a Cat defining a name and an age.
 */
public class Cat extends Animal {
  public Cat(String name, int age) {
    super(name, age);
    this.type = "cat";
    printAnimal();
  }

  public void meow() {
    System.out.println("Meow!");
  }
}
