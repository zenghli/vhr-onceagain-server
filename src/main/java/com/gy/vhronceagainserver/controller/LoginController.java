package com.gy.vhronceagainserver.controller;

import com.gy.vhronceagainserver.model.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 未登录的提示controller
 * @author: zenghl
 * @create: 2021-02-09 15:52
 **/
@RestController
public class LoginController {

    @GetMapping
    public ResponseBean login(){
        return ResponseBean.error("尚未登录，请登录");
    }
}
