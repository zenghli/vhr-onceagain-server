package com.gy.vhronceagainserver.model;

/**
 * @description: Menu里面的keepAlive与requireAuth封装在Meta对象
 * @author: zenghl
 * @create: 2021-02-22 14:34
 **/
public class Meta {

    private Boolean keepAlive;
    private Boolean requireAuth;

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public Boolean getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
