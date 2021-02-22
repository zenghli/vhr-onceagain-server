package com.gy.vhronceagainserver.service;

import com.gy.vhronceagainserver.mapper.MenuMapper;
import com.gy.vhronceagainserver.model.Hr;
import com.gy.vhronceagainserver.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: zenghl
 * @create: 2021-02-22 14:46
 **/
@Service
public class SystemConfigService {

    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenuByHrID() {
        return menuMapper.getMenuByHrID(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
