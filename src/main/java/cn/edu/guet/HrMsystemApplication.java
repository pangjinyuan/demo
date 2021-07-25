package cn.edu.guet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.edu.guet.mapper")
@ComponentScan(basePackages = "cn.edu.guet.*")
public class HrMsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrMsystemApplication.class, args);
    }

}
