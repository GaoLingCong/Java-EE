package _01Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示Request对象获取请求行数据
 */
@WebServlet("/GLCAAA")
class _01Request对象获取请求行数据 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 /*
            1. 获取请求方式 ：GET
                * String getMethod()
            2. (*)获取虚拟目录：/day14
                * String getContextPath()
            3. 获取Servlet路径: /requestDemo1
                * String getServletPath()
            4. 获取get方式请求参数：name=zhangsan
                * String getQueryString()
            5. (*)获取请求URI：/day14/demo1
                * String getRequestURI():		/day14/requestDemo1
                * StringBuffer getRequestURL()  :http://localhost/day14/requestDemo1
            6. 获取协议及版本：HTTP/1.1
                * String getProtocol()

            7. 获取客户机的IP地址：
                * String getRemoteAddr()

         */
        //1.获取请求方式 :GET
        String method = req.getMethod();
        System.out.println(method);
        //2.获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //3。获取Servlet路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        //4.获取get方式请求方式请求参数 name:zhangsan
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //5.获取请求URI
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
        //6.获取协议版本：http/1.1
        String protocol = req.getProtocol();
        System.out.println(protocol);
        //7.获取客户机的IP地址
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
