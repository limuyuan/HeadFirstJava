import java.util.*;

public class TestTree {
  public static void main(String[] args) {
    new TestTree().go();
  }

  public void go() {
    Book b1 = new Book("How Cats Work");
    Book b2 = new Book("Remix your Body");
    Book b3 = new Book("Finding Emo");

    bComparator bcomparator = new bComparator();
    TreeSet<Book> tree = new TreeSet<Book>(bcomparator);
    tree.add(b1);
    tree.add(b2);
    tree.add(b3);
    System.out.println(tree);
  }

  public class bComparator implements Comparator<Book> {
    @Override
    public int compare(Book one, Book two) {
      return one.title.compareTo(two.title);
    }
  }
}

class Book implements Comparable<Book> {
  String title;

  @Override
  public int compareTo(Book aBook) {
    return title.compareTo(aBook.title);
  }
  public Book(String t) {
    title = t;
  }

  @Override
  public String toString() {
    return title;
  }
}
