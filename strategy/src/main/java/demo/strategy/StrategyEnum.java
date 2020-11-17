package demo.strategy;

import demo.strategy.impl.CStrategyService;
import org.springframework.util.ClassUtils;
import demo.strategy.impl.AStrategyService;
import demo.strategy.impl.BStrategyService;

import java.util.Arrays;

/**
 * @Author: zhangbin
 * @Date: 2020/11/16
 */
public enum StrategyEnum {
    A("a", ClassUtils.getShortNameAsProperty(AStrategyService.class)),
    B("b", ClassUtils.getShortNameAsProperty(BStrategyService.class)),
    C("c", ClassUtils.getShortNameAsProperty(CStrategyService.class)),
    UNKONW("-", "");


    private String name;
    private String service;

    StrategyEnum(String name, String service) {
        this.name = name;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public String getService() {
        return service;
    }

    public static StrategyEnum valueOfName(String name) {
        return Arrays.asList(values()).stream().filter(e -> e.name.equals(name)).findFirst().orElse(UNKONW);
    }
}
