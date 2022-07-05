package com.mojospy.movies.config;

import com.mojospy.movies.interceptor.EncodingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author mojospy
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    EncodingInterceptor encodingInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
                 // 注册拦截器
        registry.addInterceptor(encodingInterceptor)
                // 添加拦截路径
                .addPathPatterns()
                // 放行
                .excludePathPatterns();
    }
}
