package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import demo.service.DemoService;

import javax.annotation.PostConstruct;

/**
 * @Author: zhangbin
 * @Date: 2020/11/17
 */
@SpringBootApplication
public class StrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);
    }
}
