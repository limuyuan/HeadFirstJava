public abstract class Animals {
  private int size;
  public abstract void bark();
}

class Dog extends Animals {
  public void bark() {
    System.out.println("Woof!!!");
  }
  public void play() {
    System.out.println("Play!");
  }
}

class Cat extends Animals implements Pet {
  public void bark() {
    System.out.println("Meow!!!");
  }
  public void play() {
    System.out.println("Play!");
  }
}

interface Pet{
  public abstract void play();
}
