package com.feifz.scedasprovider.service;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.feifz.scedasapi.api.HelloService;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/10/24 15:09
 */
@HSFProvider(serviceGroup = "sc-edas-provider",serviceInterface = HelloService.class ,serviceVersion = "1.0.0")
public class HelloServiceImpl implements HelloService {


    @Override
    public String hello(String str) {
        return "sc-edas-provider-提供者返回->"+str;
    }
}
