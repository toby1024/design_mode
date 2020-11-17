package demo.strategy.impl;

import demo.strategy.IStrategyServce;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangbin
 * @Date: 2020/11/16
 */
@Component
public class CStrategyService implements IStrategyServce {
    @Override
    public String execute(String parameter) {
        return "I am C demo.strategy, execute with " + parameter;
    }
}
