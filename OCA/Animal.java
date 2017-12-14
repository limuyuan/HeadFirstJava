public interface Animal {
  public String getName();
}
interface Mammal {
  public String getName();
}
abstract class Otter implements Mammal, Animal {
  public String getName() {
    return "asdfg";
  }
}
