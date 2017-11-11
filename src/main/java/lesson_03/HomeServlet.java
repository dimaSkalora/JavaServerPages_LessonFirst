package lesson_03;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    private Integer status;

    public HomeServlet() {
    }

    @Override
    public void init() throws ServletException {
        System.out.println("juhac cnonws wfvewrf rfwsfvas");
        status = Integer.parseInt(getServletConfig().getInitParameter("param_name3"));
        System.out.println("Status: "+status);
    }
    /*
    @Override
    public void init(ServletConfig config) throws ServletException {
        status = Integer.parseInt(config.getInitParameter("param_name2"));
        System.out.println("Status: "+status);
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().getServletContext().getInitParameter("hi");
        getServletContext().getInitParameter("ji");
        RequestDispatcher requestDispatcher_01 = getServletContext().getRequestDispatcher("/home.jsp");
        requestDispatcher_01.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
