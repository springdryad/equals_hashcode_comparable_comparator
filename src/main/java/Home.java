public class Home implements Comparable<Home>{
  private String type;
  private int price;
  HomeWindows windowSize;


  public Home(String type, int price, HomeWindows windowSize){
    this.type = type;
    this.price = price;
    this.windowSize = windowSize;
  }

  public int getPrice() {
    return price;
  }

  public String getType() {
    return type;
  }

  public HomeWindows getWindowSize() {
    return windowSize;
  }


  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Home home = (Home) object;
    return price == home.price
        && (type == home.type
        || (type != null && type.equals(home.getType())))
        && (windowSize == home.windowSize
        || (windowSize != null && windowSize .equals(home.getWindowSize())
    ));
  }

  @Override
  public int hashCode() {
    int result = 1;
    result =  31 * result + ((type == null) ? 0 : type.hashCode());
    result = 31 * result + price;
    result = 31 * result + ((windowSize == null) ? 0 : windowSize.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return "Home{" +
        "type='" + type + '\'' +
        ", price=" + price +
        ", windowSize=" + windowSize +
        '}';
  }

  @Override
  public int compareTo(Home object) {
    return price - object.price;
  }
}
