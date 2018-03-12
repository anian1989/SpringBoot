package com.boot.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by junshuaizhang1 on 2018/3/8.
 * 读取配置信息 application.properties
 */
@Component
public class ComponentProperties {
    @Value("${com.boot.title}")
    private String title;
    @Value("${com.boot.description}")
    private String description;

    public String getDescription() {
        return description;
    }



    public String getTitle() {
        return title;
    }


}
