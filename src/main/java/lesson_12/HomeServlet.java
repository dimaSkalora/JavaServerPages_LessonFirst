package lesson_12;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    public HomeServlet() {
    }

    @Override
    public void init() throws ServletException {

        System.out.println("init Lesson_12");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =req.getSession();
        session.setAttribute("status",req.getAttribute("status"));

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/home.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        int res = a+b;

        req.setAttribute("res",res);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/post.jsp");
        requestDispatcher.forward(req,resp);
      //  resp.sendRedirect("/lesson_12/post.jsp");
    }
}
