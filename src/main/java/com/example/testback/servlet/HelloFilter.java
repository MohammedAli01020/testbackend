package com.example.testback.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebFilter(filterName="helloFilter", urlPatterns="/helloServlet")
public class HelloFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("Executing doFilter method");
        chain.doFilter(request, response);
        System.out.println("Done executing doFilter method");
    }
}
