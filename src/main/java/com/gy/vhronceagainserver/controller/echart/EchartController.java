package com.gy.vhronceagainserver.controller.echart;

import com.gy.vhronceagainserver.model.ZhiliangGY;
import com.gy.vhronceagainserver.service.echart.EchartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 从zhilianggy表中获取数据渲染echart
 * @author: zenghl
 * @create: 2021-02-21 09:01
 **/
@RestController
@RequestMapping("/echart")
public class EchartController {

    @Autowired
    EchartService echartService;

    @GetMapping("/average")
    public List<ZhiliangGY> selectAverageByBrand() {
        return echartService.selectAverageByBrand();
    }
}
