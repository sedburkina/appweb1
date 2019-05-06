
package bf.sonabel.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/maServlet")
public class MaServlet extends HttpServlet {



    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) {
        System.out.println("Bonjour de la Servlet");

    }
}
