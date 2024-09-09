package com.itheima.controller;

import java.io.Serializable;

/**
 * @author orange
 * @date 2024/8/16
 */
public class HelloVO implements Serializable {

    private static final long serialVersionUID = -3557178851374307660L;

    private String title;

    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
