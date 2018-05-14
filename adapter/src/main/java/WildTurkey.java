/**
 * @author zhangbin
 * @date 2018/5/11 13:25
 */
public class WildTurkey implements Turkey {
  @Override
  public void gobble() {
    System.out.println("gobble gobble");
  }

  @Override
  public void fly() {
    System.out.println("i can flying a short distance");
  }
}
