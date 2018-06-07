package state;

/**
 * @author zhangbin
 * @date 2018/5/29 10:01
 */
public class GumballMachine {
  State hasQuarterState;
  State noQuarterState;
  State soldState;
  State soldOutState;

  State state = soldOutState;
  int count = 0;

  public GumballMachine(int count) {
    this.count = count;
    hasQuarterState = new HasQuarterState(this);
    noQuarterState = new NoQuarterState(this);
    soldOutState = new SoldOutState(this);
    soldState = new SoldState(this);
    if (count > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter(){
    state.ejectQuarter();
  }

  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }


  public void setState(State state) {
    this.state = state;
  }


  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getState() {
    return state;
  }

  public int getCount() {
    return count;
  }
}
