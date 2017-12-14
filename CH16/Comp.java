import java.util.*;

public class Comp {
  public static void main(String[] args) {
    new Comp().go();
  }

  public void go() {
    //ArrayList<Dog> dogs1 = new ArrayList<Animal>();
    //ArrayList<Animal> animals1 = new ArrayList<Dog>();
    List<Animal> list = new ArrayList<Animal>();
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    //ArrayList<Animal> animals = dogs;
    List<Dog> dogList = dogs;
    ArrayList<Object> objects = new ArrayList<Object>();
    ArrayList<Object> objList = objects;
    ArrayList<Object> objs = new ArrayList<Dog>();
  }

}

class Dog extends Animal{ }
class Animal { }
