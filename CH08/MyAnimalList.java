class Animal {
  private int size;

}
class Dog extends Animal {
  public void bark() {
    System.out.print("Dog!");
  }


}

class Cat extends Animal {
  public void bark() {
    System.out.print("Meow!");
  }
}


public class MyAnimalList {

  private Animal[] animals = new Animal[5];
  private int nextIndex = 0;

  public void add(Animal a) {
    if (nextIndex < animals.length) {
      animals[nextIndex] = a;
      System.out.println("Animal added at " + nextIndex);
      nextIndex++;
    }
  }
}
