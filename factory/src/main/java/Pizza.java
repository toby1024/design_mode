/**
 * @author zhangbin
 * @date 2018/5/8 10:53
 */
public class Pizza {

  private String style;

  public Pizza(String style) {
    this.style = style;
  }

  public void prepare() {
    System.out.println(style + ":prepare");
  }

  public void bake() {
    System.out.println(style + ":bake");
  }

  public void cut() {
    System.out.println(style + ":cut");
  }

  public void box() {
    System.out.println(style + ":box");
  }
}
