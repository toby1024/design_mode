package state;


/**
 * @author zhangbin
 * @date 2018/5/29 09:59
 */
public class NoQuarterState implements State{

  GumballMachine machine;

  public NoQuarterState(GumballMachine machine) {
    this.machine = machine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    machine.setState(machine.getHasQuarterState());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned, but no quarter inserted");
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}
