import java.util.*;
import java.io.*;

public class JukeBox8 {
  ArrayList<Song> songList = new ArrayList<Song>();
  public static void main(String[] args) {
    new JukeBox8().go();
  }

  class ArtistCompare implements Comparator<Song> {
    public int compare(Song one, Song two) {
      return one.getArtist().compareTo(two.getArtist());
    }
  }

  class TitleCompare implements Comparator<Song> {
    public int compare(Song one, Song two) {
      return one.getTitle().compareTo(two.getTitle());
    }
  }

  public void go() {
    getSongs();
    System.out.println(songList + "\n");
    Collections.sort(songList);
    System.out.println(songList + "\n");

    TreeSet<Song> songSet = new TreeSet<Song>();
    songSet.addAll(songList);
    System.out.println(songSet+ "\n");

/*
    ArtistCompare artistCompare = new ArtistCompare();
    Collections.sort(songList, artistCompare);
    System.out.println(songList);
    System.out.println();

    TitleCompare titleCompare = new TitleCompare();
    Collections.sort(songList, titleCompare);
    System.out.println(songList);
    System.out.println();
    */
  }

  public void getSongs() {
    try {
      File file = new File("SongListMore.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while ((line = reader.readLine()) != null) {
        addSong(line);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public void addSong(String lineToParse) {
    String[] tokens = lineToParse.split("/");
    Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
    songList.add(nextSong);
  }
}
