package 过滤器Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*.

过滤器生命周期方法
			1. init:在服务器启动后，会创建Filter对象，然后调用init方法。只执行一次。用于加载资源
			2. doFilter:每一次请求被拦截资源时，会执行。执行多次
			3. destroy:在服务器关闭后，Filter对象被销毁。如果服务器是正常关闭，则会执行destroy方法。只执行一次。用于释放资源

			*/
@WebFilter("/*")
public class _02_Filter过滤器生命周期 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        1. init:在服务器启动后，会创建Filter对象，然后调用init方法。只执行一次。用于加载资源
        System.out.println("init方法执行拉");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        2. doFilter:每一次请求被拦截资源时，会执行。执行多次
        System.out.println("doFilter执行拉");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
//        3. destroy:在服务器关闭后，Filter对象被销毁。如果服务器是正常关闭，则会执行destroy方法。只执行一次。用于释放资源
        System.out.println("destroy执行拉");
    }
}
