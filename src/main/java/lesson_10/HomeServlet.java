package lesson_10;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    private String str = "Lesson_10";

    public HomeServlet() {
    }

    @Override
    public void init() throws ServletException {

        System.out.println("init Lesson_10");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =req.getSession();
        //session.setMaxInactiveInterval(60);
       /* session.setAttribute("abc",523);
        String s = (String) session.getAttribute("abc");
        session.removeAttribute("abc");*/

        session.setAttribute("aabb","123");


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
      //  resp.sendRedirect("/lesson_08/post.jsp");
    }
}
