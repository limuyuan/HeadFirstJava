public class Egret {
  private String color;
  public Egret() {
    this("White");
  }
  public Egret(String color) {
    color = color;
  }
  public static void main(String[] args) {
    Egret e = new Egret();
    System.out.println("Color: " + e.color);
  }
}
