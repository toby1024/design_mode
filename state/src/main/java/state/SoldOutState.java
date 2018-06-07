package state;

/**
 * @author zhangbin
 * @date 2018/5/29 09:58
 */
public class SoldOutState implements State {
  private GumballMachine machine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.machine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Gumball was sold out");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned,but no quarter inserted");
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}
