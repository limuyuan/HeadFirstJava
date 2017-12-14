public class DotComTestDrive {
  public static void main(String[] args) {
    DotCom dot = new DotCom();
    int[] locations = {2,3,4};
    dot.setLocationCells(locations);
    String userGuess = "1";
    String result = dot.checkYourself(userGuess);
  }
}
