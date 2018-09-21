package com.ktnw.management.adpater;

import com.ktnw.management.interceptor.RequestInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CustomWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter{

    private static final Logger logger = LoggerFactory.getLogger(CustomWebMvcConfigurerAdapter.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("注册跨域请求拦截器 RequestInterceptor");
        registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/**");  //对来自/user/** 这个链接来的请求进行拦截
    }
}
