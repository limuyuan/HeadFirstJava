import java.util.*;
public class DotComBust {
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
  private int numOfGuesses = 0;

  private void setUpGame() {
    //first make some dot coms and give them locationis
    DotCom one = new DotCom();
    one.setName("capgemini.com");
    DotCom two = new DotCom();
    two.setName("limuyuan.tech");
    DotCom three = new DotCom();
    three.setName("github.com");
    dotComsList.add(one);
    dotComsList.add(two);
    dotComsList.add(three);

    System.out.println("Your goal is to sink three dot coms.");
    System.out.println(one.getName() + ", " + two.getName() + ", " + three.getName());
    //System.out.println("Pets.com, eToys.com, Go2.com");
    System.out.println("Try to sink them all in the fewest number of gresses");

    for (DotCom dotComToSet : dotComsList) {
      ArrayList<String> newLocation = helper.placeDotCom(3);
      dotComToSet.setLocationCells(newLocation);
    }
  }

  private void startPlaying() {
    while (!dotComsList.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess);
    }
    finishGame();;
  }

  private void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss";

    for (DotCom dotComToTest : dotComsList) {
      result = dotComToTest.checkYourself(userGuess);
      if (result.equals("hit")) {
        break;
      }
      if (result.equals("kill")) {
        dotComsList.remove(dotComToTest);
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame() {
    System.out.println("All Dot Coms are dead! Your stock is now worhtless.");
    if (numOfGuesses < 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
      System.out.println("You got out before your options sank.");
    } else {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
      System.out.println("Fish are dancing with your options.");
    }
  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }
}
