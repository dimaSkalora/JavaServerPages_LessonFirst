package lesson_13;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class FileLoadServlet extends HttpServlet{
    public FileLoadServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //   resp.setContentType("application/octet-stream");
     //   resp.setHeader("Content-Disposition", "attachment;filename=text.txt");
        FileInputStream fis;
        try {
            fis = new FileInputStream(new File("c://Eclip/user.txt"));
            ServletOutputStream sos = resp.getOutputStream();
            byte[] out = new byte[1024];
            while (fis.read(out,0,1024) != -1){
             sos.write(out,0,1024);
            }
            fis.close();
            sos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
