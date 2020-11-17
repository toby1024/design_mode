package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.strategy.StrategyEnum;
import demo.strategy.StrategyFactory;

/**
 * @Author: zhangbin
 * @Date: 2020/11/17
 */
@Service
public class DemoService {
    @Autowired
    private StrategyFactory strategyFactory;

    public String execute(String parameter, String clazz) {
        return strategyFactory.get(clazz).execute(parameter);
    }

    public String executeWithEnum(String parameter, StrategyEnum strategyEnum) {
        return strategyFactory.get(strategyEnum).execute(parameter);
    }
}
