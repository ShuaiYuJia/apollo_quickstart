package com.alibaba.apollo_quickstart;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 开启apollo配置
@EnableApolloConfig
public class ApolloQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloQuickstartApplication.class, args);

    }
}
