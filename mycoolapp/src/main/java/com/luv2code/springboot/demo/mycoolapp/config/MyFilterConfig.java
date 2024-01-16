package com.luv2code.springboot.demo.mycoolapp.config;

import com.luv2code.springboot.demo.mycoolapp.Filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration

// configuring URL with filter means to call a filter when a particular api endpoint is hit

public class MyFilterConfig {

    public FilterRegistrationBean<MyNewFilter>registerationBean(){

        FilterRegistrationBean<MyNewFilter> registerationBean = new FilterRegistrationBean<>();
        registerationBean.setFilter(new MyNewFilter());
        registerationBean.addUrlPatterns("/customers/");
        return registerationBean;

    }

}
