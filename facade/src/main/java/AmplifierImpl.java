/**
 * @author zhangbin
 * @date 2018/5/17 16:55
 */
public class AmplifierImpl implements Amplifier {
  @Override
  public void open() {
    System.out.println("打开放大器");
  }

  @Override
  public void work() {
    System.out.println("放大器开始工作");
  }

  @Override
  public void close() {
    System.out.println("关闭放大器");
  }
}
