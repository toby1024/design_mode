/**
 * @author zhangbin
 * @date 2018/5/4 17:05
 */
public class Main {
  public static void main(String[] args) {
    Beverage espresso = new Espresso();
    System.out.println(espresso.getDescription() + ", $" + espresso.cost());
    espresso = new Mocha(espresso);
    System.out.println(espresso.getDescription() + ", $" + espresso.cost());
  }
}
