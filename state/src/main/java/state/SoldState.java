package state;

/**
 * @author zhangbin
 * @date 2018/5/29 09:57
 */
public class SoldState implements State {
  GumballMachine machine;

  public SoldState(GumballMachine gumballMachine) {
    this.machine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we already giving you a gumball");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, we already giving you a gumball");
  }

  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball");
  }

  @Override
  public void dispense() {
    if (machine.getCount() > 0) {
      machine.setState(machine.getNoQuarterState());
    } else {
      System.out.println("Oops, out of gumballs");
      machine.setState(machine.getSoldOutState());
    }
  }
}
