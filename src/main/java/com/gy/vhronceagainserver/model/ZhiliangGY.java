package com.gy.vhronceagainserver.model;

import java.util.Date;

/**
 * @description: zhiliangGY的model
 * @author: zenghl
 * @create: 2021-02-21 09:13
 **/
public class ZhiliangGY {
    private Integer id;

    private Date riqi;

    private String brand;

    private String erclass;

    private Integer jnumber;

    private Float actualscore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRiqi() {
        return riqi;
    }

    public void setRiqi(Date riqi) {
        this.riqi = riqi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getErclass() {
        return erclass;
    }

    public void setErclass(String erclass) {
        this.erclass = erclass;
    }

    public Integer getJnumber() {
        return jnumber;
    }

    public void setJnumber(Integer jnumber) {
        this.jnumber = jnumber;
    }

    public Float getActualscore() {
        return actualscore;
    }

    public void setActualscore(Float actualscore) {
        this.actualscore = actualscore;
    }
}
