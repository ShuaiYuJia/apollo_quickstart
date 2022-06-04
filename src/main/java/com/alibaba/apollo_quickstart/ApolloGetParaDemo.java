package com.alibaba.apollo_quickstart;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.springframework.boot.SpringApplication;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/6/4
 * @Description:
 */
public class ApolloGetParaDemo {
    public static void main(String[] args) {
//        读取默认的配置信息
//        Config config = ConfigService.getAppConfig();

//        获取指定namespace的配置信息
        final Config config = ConfigService.getConfig("spring-kafka");

        // 获取配置信息，第一个参数：配置的key, 第二个参数：默认值
        while (true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            String property = config.getProperty("sms.enable", null);
            final String property = config.getProperty("kafka.name-server", null);
            System.out.println("取得的apollo配置参数是"+property);

        }
    }
}
