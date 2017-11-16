package lesson_12;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AuthFilter implements Filter{
    private List<String> pathFilters = Arrays.asList(new String[]{"add","remote","update","lesson_12/home.html"});

    public AuthFilter() {
        System.out.println("AuthFilter - Lesson_12");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String uri = ((HttpServletRequest)request).getRequestURI();
        String path = StringUtils.substringAfter(uri,"/");

        if(!pathFilters.contains(path)){
            chain.doFilter(request,response);
            return;
        }

        HttpSession session = ((HttpServletRequest)request).getSession();
        User user = (User)session.getAttribute("PRINCIPAL");

        if(user != null){
            chain.doFilter(request,response);
            return;
        }

        ((HttpServletResponse )response).sendRedirect("login.jsp?loginOrPassword=invalid");
    }

    @Override
    public void destroy() {

    }
}
