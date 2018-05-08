/**
 * @author zhangbin
 * @date 2018/5/8 11:06
 */
public class WDLStylePizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(String type) {
    // 工厂方法，自己决定如何实现，以达到解耦的目的
    return new Pizza(type);
  }
}
