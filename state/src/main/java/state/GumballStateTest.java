package state;

/**
 * @author zhangbin
 * @date 2018/5/29 11:30
 */
public class GumballStateTest {

  public static void main(String[] args) {
    GumballMachine machine = new GumballMachine(10);

    machine.insertQuarter();
    machine.turnCrank();
    machine.ejectQuarter();

  }
}
