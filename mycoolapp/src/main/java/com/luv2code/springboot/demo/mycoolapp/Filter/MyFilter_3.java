package com.luv2code.springboot.demo.mycoolapp.Filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;

import java.io.IOException;

// we can implement filter functionality using severelet API
// Override method doFilter
@Order(2)
public class MyFilter_3 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter_3 is called");
        filterChain.doFilter(servletRequest,servletResponse);


    }
}
