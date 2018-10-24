package com.feifz.scedasconsumer;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.feifz.scedasapi.api.HelloService;

import org.springframework.context.annotation.Configuration;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/10/24 15:20
 */
@Configuration
public class HsfConfig {

    @HSFConsumer(serviceGroup = "sc-edas-provider",clientTimeout = 3000,serviceVersion = "1.0.0")
    private HelloService helloService;
}
