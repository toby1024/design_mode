package demo.service;

import demo.strategy.StrategyEnum;
import demo.strategy.impl.AStrategyService;
import demo.strategy.impl.BStrategyService;
import demo.strategy.impl.CStrategyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ClassUtils;

@SpringBootTest
class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    void test() {
        System.out.println(demoService.execute("test a1", ClassUtils.getShortNameAsProperty(AStrategyService.class)));
        System.out.println(demoService.execute("test b1", ClassUtils.getShortNameAsProperty(BStrategyService.class)));
        System.out.println(demoService.execute("test c1", ClassUtils.getShortNameAsProperty(CStrategyService.class)));
    }

    @Test
    void test2() {
        System.out.println(demoService.executeWithEnum("test a2", StrategyEnum.A));
        System.out.println(demoService.executeWithEnum("test b2", StrategyEnum.B));
        System.out.println(demoService.executeWithEnum("test c2", StrategyEnum.C));
    }
}