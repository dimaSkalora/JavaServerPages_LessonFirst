package lesson_07;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    private String str = "Lesson_07";

    public HomeServlet() {
    }

    @Override
    public void init() throws ServletException {

        System.out.println("init Lesson_07");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("a",1);
        req.setAttribute("b","dbsbsdtsr");
        req.setAttribute("str",str);

        User user = new User("Ivan","Ivanov",23);
        req.setAttribute("user",user);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/home.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
