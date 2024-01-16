package com.luv2code.springboot.demo.mycoolapp.Filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

// we can implement filter functionality using severelet API
// Override method doFilter
@Component
public class MyNewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("New Filter is called");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
