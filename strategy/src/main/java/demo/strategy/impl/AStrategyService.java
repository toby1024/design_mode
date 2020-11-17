package demo.strategy.impl;

import org.springframework.stereotype.Component;
import demo.strategy.IStrategyServce;

/**
 * @Author: zhangbin
 * @Date: 2020/11/16
 */
@Component
public class AStrategyService implements IStrategyServce {
    @Override
    public String execute(String parameter) {
        return "I am A demo.strategy, execute with " + parameter;
    }
}
