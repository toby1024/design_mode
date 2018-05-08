/**
 * @author zhangbin
 * @date 2018/5/4 15:41
 */
public abstract class Beverage {

   String description = "Unknown Beverage";

  public String getDescription(){
    return description;
  }

  public abstract double cost();
}
