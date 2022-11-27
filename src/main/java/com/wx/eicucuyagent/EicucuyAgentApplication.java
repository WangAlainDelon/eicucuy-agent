package com.wx.eicucuyagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EicucuyAgentApplication {

    public static void main(String[] args) {
        // Java 操作K8S的API
        // https://blog.csdn.net/a772304419/article/details/126725026
        // https://www.kubernetes.org.cn/8984.html
        // https://huaweicloud.csdn.net/6331148bd3efff3090b51964.html
        SpringApplication.run(EicucuyAgentApplication.class, args);
    }

}
