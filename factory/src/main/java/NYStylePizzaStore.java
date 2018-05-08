/**
 * @author zhangbin
 * @date 2018/5/8 10:56
 */
public class NYStylePizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(String type) {
    return new Pizza(type);
  }
}
