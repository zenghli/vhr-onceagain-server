package com.gy.vhronceagainserver.mapper;

import com.gy.vhronceagainserver.model.Hr;
import org.springframework.stereotype.Repository;

@Repository
public interface HrMapper {
    Hr loadUserByUsername(String username);
}
