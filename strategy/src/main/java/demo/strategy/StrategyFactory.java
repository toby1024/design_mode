package demo.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author: zhangbin
 * @Date: 2020/11/17
 */
@Component
public class StrategyFactory {
    @Autowired
    private Map<String, IStrategyServce> map;

    public IStrategyServce get(StrategyEnum strategy){
        return map.get(strategy.getService());
    }

    public IStrategyServce get(String clazz){
        return map.get(clazz);
    }
}
