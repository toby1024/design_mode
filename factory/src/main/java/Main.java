/**
 * @author zhangbin
 * @date 2018/5/8 10:58
 */
public class Main {
  public static void main(String[] args) {
    PizzaStore store = new NYStylePizzaStore();
    Pizza pizza = store.orderPizza("NYStyle");

    WDLStylePizzaStore wdlStore = new WDLStylePizzaStore();
    pizza = wdlStore.orderPizza("武大郎酱香土烧饼");
  }
}
