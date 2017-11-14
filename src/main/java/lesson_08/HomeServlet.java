package lesson_08;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    private String str = "Lesson_08";

    public HomeServlet() {
    }

    @Override
    public void init() throws ServletException {

        System.out.println("init Lesson_08");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("a1",1);
        req.setAttribute("b1","dbsbsdtsr");
        req.setAttribute("str",str);

        User user = new User("Ivan","Ivanov",25);
        req.setAttribute("user",user);

        int a2 = Integer.parseInt(req.getParameter("a2"));
        int b2 = Integer.parseInt(req.getParameter("b2"));
        int res = a2+b2;

        req.setAttribute("res",res);

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
