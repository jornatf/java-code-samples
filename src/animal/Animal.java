package animal;

/**
 * Parent class to create an animal.
 */
public class Animal {
  private int age;
  private String name;
  protected String type;
  private static int count;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    refreshCount();
  }

  protected void printAction(String action) {
    String str = String.format("%s is %s.", this.name, action);
    System.out.println(str);
  }

  protected void printAnimal() {
    String str = String.format("%s is a %s and it is %s years old", this.name, this.type, this.age);
    System.out.println(str);
  }

  public void move() {
    printAction("moving");
  }

  public void eat() {
    printAction("eating");
  }

  private static void refreshCount() {
    count++;
  }

  public static int getCount() {
    return count;
  }
}
