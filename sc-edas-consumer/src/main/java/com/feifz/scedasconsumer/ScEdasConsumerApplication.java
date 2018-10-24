package com.feifz.scedasconsumer;

import com.taobao.pandora.boot.PandoraBootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScEdasConsumerApplication {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(ScEdasConsumerApplication.class, args);
        PandoraBootstrap.markStartupAndWait();
    }
}
