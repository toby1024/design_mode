package nomarl;

/**
 * @author zhangbin
 * @date 2018/5/28 15:28
 */
public class GumballMachineTest {
  public static void main(String[] args) {
    GumballMachine machine = new GumballMachine(10);
    System.out.println(machine);

    machine.dispense();

    machine.insertQuarter();
    machine.turnCrank();
    machine.ejectQuarter();

    System.out.println(machine);
  }
}
