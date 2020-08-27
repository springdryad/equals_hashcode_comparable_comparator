public class HomeWindows {
  public String size;

  public HomeWindows(String size) {
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    HomeWindows window = (HomeWindows) object;
    return (size == window.size || (size != null && size.equals(window.getSize())));
  }

  @Override
  public String toString() {
    return "HomeWindows{" +
        "size='" + size + '\'' +
        '}';
  }
}
