package options;

/**
 * @Author: zhangbin
 * @Date: 2020/11/6
 */
public class Worker {
    private String name;
    private State currentState;

    public Worker(String name, State currentState) {
        this.name = name;
        this.currentState = currentState;
    }

    /**
     * 条件分支实现状态机
     */
    public void execute() {
        if (currentState.equals(State.SLEEP)) {
            System.out.println(this.name + " is stop sleep, start work");
            this.currentState = State.START;
        } else if (currentState.equals(State.START)) {
            System.out.println(this.name + " is working, stop it");
            this.currentState = State.STOP;
        } else if (currentState.equals(State.STOP)) {
            System.out.println(this.name + " is stopped, start sleeping");
            this.currentState = State.SLEEP;
        }
    }


}
