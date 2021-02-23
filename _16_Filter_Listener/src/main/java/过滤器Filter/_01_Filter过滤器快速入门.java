package 过滤器Filter;

import javax.servlet.*;
import java.io.IOException;

/*Filter过滤器
* web三大组价
* Servlet
* Filter
* Listener
*
*
* 注意过滤器Filter接口的是Servlet下的记得导包*/
//@WebFilter("/*")//访问所有资源，都会执行该过滤器
public class _01_Filter过滤器快速入门 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器执行");

        //过滤器放行代码
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
