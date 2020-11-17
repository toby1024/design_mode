package options;

/**
 * @Author: zhangbin
 * @Date: 2020/11/6
 */
public class Demo {
    public static void main(String[] args) {
        Worker worker = new Worker("Mari", State.SLEEP);
        worker.execute();
        worker.execute();
        worker.execute();
        worker.execute();
    }
}
