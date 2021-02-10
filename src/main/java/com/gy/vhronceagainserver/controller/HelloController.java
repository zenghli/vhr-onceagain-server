package com.gy.vhronceagainserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "description of class")
@RestController
public class HelloController {

    @ApiOperation(value = "description of method", notes = "")
    @GetMapping("/hello")
    public String hello(){
        return "hello, zenghl";
    }

}
