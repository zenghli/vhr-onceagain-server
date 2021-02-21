package com.gy.vhronceagainserver.mapper;

import com.gy.vhronceagainserver.model.ZhiliangGY;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EchartMapper {
    List<ZhiliangGY> selectAverageByBrand();
}
