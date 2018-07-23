package com.changtai.ch7_6;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Auther: zhaoct
 * @Date: 2018-07-23 21:38
 * @Description:
 */
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/changtai").setViewName("/changtai ");
    }

}
