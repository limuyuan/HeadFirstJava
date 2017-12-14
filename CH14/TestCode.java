import java.io.*;

public class TestCode {

  public void makeCard(String line) { }
  private File file;
  private class GameCharacter { }

  public static void main(String[] args) {
    TestCode ts = new TestCode();
    try {
      ts.go();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }

  public void go() throws Exception {

    /*1
        FileReader fileReader = new FileReader();
        BufferedReader reader = new BufferedReader(fileReader);
    */

    /*2
        FileOutputStream f = new FileOutputStream(new File("Foo.ser"));
        ObjectOutputStream os = new ObjectOutputStream(f);
    */

    /*3
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = reader.readLine()) != null) {
          makeCard(line);
        }
    */

    ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
    GameCharacter oneAgain = (GameCharacter) is.readObject();
  }
}
