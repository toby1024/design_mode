package demo.strategy.impl;

import org.springframework.stereotype.Component;
import demo.strategy.IStrategyServce;

/**
 * @Author: zhangbin
 * @Date: 2020/11/16
 */
@Component
public class BStrategyService implements IStrategyServce {
    @Override
    public String execute(String parameter) {
        return "I am B demo.strategy, execute with " + parameter;
    }
}
