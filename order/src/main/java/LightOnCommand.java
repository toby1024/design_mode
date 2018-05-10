/**
 * @author zhangbin
 * @date 2018/5/9 09:25
 */
public class LightOnCommand implements Command {
  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}
