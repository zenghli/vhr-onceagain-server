package com.gy.vhronceagainserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gy.vhronceagainserver.mapper")
public class VhrOnceagainServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrOnceagainServerApplication.class, args);
    }

}
