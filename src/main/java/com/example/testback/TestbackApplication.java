package com.example.testback;

import com.example.testback.servlet.HelloFilter;
import com.example.testback.servlet.HelloListener;
import com.example.testback.servlet.HelloServlet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

//@ServletComponentScan
@Slf4j
@SpringBootApplication(scanBasePackages = "com.example.testback")
public class TestbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestbackApplication.class, args);


//        BooleanFunction<Integer> isEvent = n -> n % 2 == 0;
//
//        isEvent.apply(4);
//
//        BooleanFunction<Integer> isPositive = n -> n > 0;
//
//        BooleanFunction<Integer> isEvent = new BooleanFunction<Integer>() {
//            @Override
//            public Boolean apply(Integer n) {
//                return n % 2 == 0;
//            }
//        };
//
//
//        BooleanFunction<Integer> isPositive = new BooleanFunction<Integer>() {
//            @Override
//            public Boolean apply(Integer n) {
//                return n > 0;
//            }
//        };
//        Boolean result = (isEvent.and(isPositive)).apply(5);
//
//        log.info("result: {} ", result);
//                Boolean result = isEvent.apply(5) && isPositive.apply(5);


    }


    /// Register Servlet.
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean servletBean = new ServletRegistrationBean(new HelloServlet());
        servletBean.addUrlMappings("/helloServlet");
        return servletBean;
    }

    /// Register Filter.
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean(new HelloFilter());
        // Add filter path
        filterBean.addUrlPatterns("/helloServlet");
        return filterBean;
    }

    @Bean
    public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean listenerBean =
                new ServletListenerRegistrationBean(new HelloListener());
        return listenerBean;
    }








}


@FunctionalInterface
interface BooleanFunction<T> extends Function<T, Boolean> {

    @Override
    Boolean apply(T t);

    default BooleanFunction<T> and(BooleanFunction<T> other) {

        return t -> this.apply(t) && other.apply(t);
    }


}
