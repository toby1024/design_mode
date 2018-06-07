package state;

/**
 * @author zhangbin
 * @date 2018/5/28 17:02
 */
public interface State {
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
}
