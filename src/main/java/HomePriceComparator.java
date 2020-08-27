import java.util.Comparator;

public class HomePriceComparator implements Comparator<Home> {

  @Override
  public int compare(Home price1, Home price2) {
    return price1.getPrice() < price2.getPrice() ? -1 : price1.getPrice() == price2.getPrice() ? 0 : 1;

  }
}
