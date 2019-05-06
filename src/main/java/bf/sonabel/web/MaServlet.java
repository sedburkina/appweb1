
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
        String param = req.getParameter("nom");

        PrintWriter pw = rep.getWriter();
        pw.println("<div style=\"color:red;\">Bonjour de la Servlet</div>");
        pw.println("<p>" + param + "</p>");
        pw.close();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws IOException {

        String param = req.getParameter("monTexte");

        PrintWriter pw = rep.getWriter();
        pw.println("<div style=\"color:red;\">Bonjour de la Servlet doPost </div>");
        pw.println("<p> le contenu envoyé est : " + param + "</p>");
        pw.close();
    }
}
