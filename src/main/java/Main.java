import java.util.*;

public class Main {
  public static void main(String[] args) {
    Home economy =  new Home ("economy", 120000, new HomeWindows("small"));
    Home economy2 = new Home ("economy", 120000, new HomeWindows("small"));
    Home standard = new Home ("standard", 250000, new HomeWindows("medium"));

    System.out.println("Is economy = standard? - " + economy.equals(standard));
    System.out.println("Is economy = economy2? - " + economy.equals(economy2));
    System.out.println("Hashcode of economy: " + economy.hashCode());
    System.out.println("Hashcode of economy2: " + economy2.hashCode());

    Map<Home, Integer> map = new TreeMap<>();
    map.put(economy, 1);
    map.put(standard, 2);
    map.put(economy2, 3);

    System.out.println("\n" + "Unique homes:");
    for (Map.Entry<Home, Integer> entry: map.entrySet()) {
      System.out.println(entry.getKey());
    }

    List<Home> homes = new ArrayList<>();
    homes.add(new Home("economy", 12000, new HomeWindows("small")));
    homes.add(new Home("standard", 13000, new HomeWindows("medium")));
    homes.add(new Home("premium", 10000, new HomeWindows("big")));
    homes.add(new Home("luxury", 9000, new HomeWindows("large")));

    homes.sort(new HomePriceComparator());
    System.out.println("\n" + "Sort by price");
    for (Home item: homes) {
      System.out.println(item);
    }


    homes.sort(new HomeTypeComparator());
    System.out.println("\n" + "Sort by type");
    for (Home item: homes) {
      System.out.println(item);
    }

  }
}
