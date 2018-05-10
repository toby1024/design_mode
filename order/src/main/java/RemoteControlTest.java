/**
 * @author zhangbin
 * @date 2018/5/9 09:28
 */
public class RemoteControlTest {

  public static void main(String[] args) {
    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    simpleRemoteControl.setCommand(lightOnCommand);
    simpleRemoteControl.buttonWasPressed();
  }
}
