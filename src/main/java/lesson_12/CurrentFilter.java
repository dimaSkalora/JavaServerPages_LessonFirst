package lesson_12;

import javax.servlet.*;
import java.io.IOException;

public class CurrentFilter implements Filter {
    private boolean status;
    public CurrentFilter() {
        System.out.println("CurrentFilter - Lesson_12");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.status = Boolean.parseBoolean(filterConfig.getInitParameter("status"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("status",this.status);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
