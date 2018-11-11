package net.clazz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * @author yorick
 * @date 2018-11-11
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    public static void main( String[] args ) {
        SpringApplication.run(HelloWorld.class, args);

    }
}
