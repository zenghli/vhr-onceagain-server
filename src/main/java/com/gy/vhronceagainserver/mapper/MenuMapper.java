package com.gy.vhronceagainserver.mapper;

import com.gy.vhronceagainserver.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {

    List<Menu> getMenuByHrID(Integer hrId);
}
