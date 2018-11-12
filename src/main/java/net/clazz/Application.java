package net.clazz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 * @author yorick
 * @date 2018-11-11
 */

//@SpringBootApplication 等同于下面3个注解加起来的效果
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}
