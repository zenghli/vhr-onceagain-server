package com.gy.vhronceagainserver.controller;

import com.gy.vhronceagainserver.model.Menu;
import com.gy.vhronceagainserver.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 从数据库中获取当前用户的菜单信息返回给前端
 * @author: zenghl
 * @create: 2021-02-22 14:44
 **/
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Autowired
    SystemConfigService systemConfigService;

    @GetMapping("/menu")
    public List<Menu> getMenuByHrID(){
        return systemConfigService.getMenuByHrID();
    }
}
