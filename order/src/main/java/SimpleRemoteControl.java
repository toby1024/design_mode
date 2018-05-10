/**
 * @author zhangbin
 * @date 2018/5/9 09:26
 */
public class SimpleRemoteControl {
  private Command slot;

  public SimpleRemoteControl() {
  }

  public void setCommand(Command slot) {
    this.slot = slot;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
