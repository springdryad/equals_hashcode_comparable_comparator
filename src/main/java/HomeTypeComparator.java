import java.util.Comparator;

public class HomeTypeComparator implements Comparator<Home> {

  @Override
  public int compare(Home type1, Home type2) {
    return type1.getType().compareToIgnoreCase(type2.getType());
  }
}
