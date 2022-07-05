package com.mojospy.movies.config;

import com.mojospy.movies.interceptor.EncodingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    EncodingInterceptor encodingInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(encodingInterceptor)  // 注册拦截器
                .addPathPatterns()  // 添加拦截路径
                .excludePathPatterns(); // 放行
    }
}
