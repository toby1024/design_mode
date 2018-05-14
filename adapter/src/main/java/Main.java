/**
 * @author zhangbin
 * @date 2018/5/11 13:19
 */
public class Main {


  public static void main(String[] args) {
    Duck duck = new MallardDuck();
    duck.quack();
    duck.fly();

    Turkey turkey = new WildTurkey();
    turkey.gobble();
    turkey.fly();

    Duck turkey_duck = new TurkeyAdapter(turkey);
    turkey_duck.quack();
    turkey_duck.fly();
  }
}
