package com.alibaba.apollo_quickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/6/4
 * @Description:
 */


/**
 * server.servlet.context-path
 * 上述配置会增加访问路径
 *
 * config service 负责配置信息的读取
 * admin service 负责配置信息的发布
 *
 * 在生产环境中，
 * 每一套环境都要部署一套config service和admin service,
 * 而portal是统一的，只需要布置一项
 *
 */


@RestController
public class AccountController {


    /**
     * 使用apollo和springboot整合，只需要将key放进去查找就行了，不需要namespace
     */
//    @Value("${sms.enable}")
//    private String enableSwagger;

    @Value("${haha}")
    private String haha;
//
//    @GetMapping("/swagger")
//    public String swagger(){
//        System.out.println(enableSwagger);
//        return enableSwagger+haha;
//    }

    @GetMapping("/haha")
    public String getHaha(){
        System.out.println(haha);
        return haha;
    }




//    @Value("${shuaishuai}")
//    private String shuai;
//
//    @GetMapping("/ss")
//    private String ss(){
//        System.out.println(shuai);
//        return shuai;
//    }


//    @Value("${aaa}")
//    private String aaa;
//
//    @GetMapping("/aaaa")
//    public String hehe(){
//        return aaa;
//    }



//    private ;

//    @GetMapping("/datasource")
//    public String datasource(@Value("${spring.datasource.url}") String str){
//        System.out.println(str);
//        return str;
//    }




//    @Value("${spring.datasource.type}")
//    private String str;
//
//    @GetMapping("/spring")
//    public String springDatasourceType(){
//
//        System.out.println(str);
//        return str;
//    }

}
