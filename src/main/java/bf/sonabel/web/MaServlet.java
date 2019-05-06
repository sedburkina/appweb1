
package bf.sonabel.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/maServlet")
public class MaServlet extends HttpServlet {



    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException {
        //System.out.println("Bonjour de la Servlet");
        PrintWriter pw = rep.getWriter();
        pw.println("Bonjour de la Servlet");
        pw.close();
    }
}
