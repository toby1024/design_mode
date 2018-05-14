/**
 * @author zhangbin
 * @date 2018/5/11 13:19
 */
public class MallardDuck implements Duck {
  @Override
  public void quack() {
    System.out.println("gua gua gua");
  }

  @Override
  public void fly() {
    System.out.println("i can fly");
  }
}
