package com.luv2code.springboot.demo.mycoolapp.Filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;

import java.io.IOException;

// we can implement filter functionality using severelet API
// Override method doFilter
@Order(1)
public class MyFilter_1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter_1 is called");
        filterChain.doFilter(servletRequest,servletResponse);


    }
}
