package lesson_09;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    private String str = "Lesson_09";

    public HomeServlet() {
    }

    @Override
    public void init() throws ServletException {

        System.out.println("init Lesson_09");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("aaa","wewgwsgvr");
        cookie.setMaxAge(60*60*24);
        //cookie.setMaxAge(0);
        resp.addCookie(cookie);
        /*
        Cookie[] cookies = req.getCookies();
        for(Cookie c: cookies){
            String s = c.getName();
            //c.getMaxAge();
        }*/

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
