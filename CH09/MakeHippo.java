public class MakeHippo {
  public static void main(String[] args) {
    Hippo h = new Hippo("Buffy");
    System.out.println(h.getName());
  }
}

class Mini extends Car {
  Color color;

  public Mini() {
    this(Color.Red);
  }

  public Mini(Color c) {
    super("Mini");
    color = c;
  }
}
