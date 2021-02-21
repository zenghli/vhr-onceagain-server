package com.gy.vhronceagainserver.service.echart;

import com.gy.vhronceagainserver.mapper.EchartMapper;
import com.gy.vhronceagainserver.model.ZhiliangGY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: echartService
 * @author: zenghl
 * @create: 2021-02-21 09:04
 **/
@Service
public class EchartService {

    @Autowired
    EchartMapper echartMapper;

    public List<ZhiliangGY> selectAverageByBrand() {
        return echartMapper.selectAverageByBrand();
    }
}
