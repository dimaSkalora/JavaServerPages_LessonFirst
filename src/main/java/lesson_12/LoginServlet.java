package lesson_12;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private UserDataSource userDataSource;

    public LoginServlet() {
        userDataSource = new UserDataSource();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        System.out.println(userName);
        System.out.println(password);

        if(userName != null && password != null ){
            User user = userDataSource.getByUserNamesAndPassword(userName,password);
            if(user != null){
                session.setAttribute("PRINCIPAL",user);
                resp.sendRedirect("/lesson_12/home.html");
                return;
            }
        }
        resp.sendRedirect("login.jsp?loginOrPassword=invalid");
    }
}
