import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RedirectionServlet", value = "/RedirectionServlet")
public class RedirectionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userDetails = req.getHeader("User-Agent").toLowerCase();
        System.out.println(userDetails);
        if(userDetails.contains("edg")){

            resp.sendRedirect("https://www.microsoft.com/en-us/edge?ep=313&form=MA13M0&es=40");
        } else if (userDetails.contains("firefox")) {
            resp.sendRedirect("https://www.mozilla.org/en-US/firefox/new/");
        } else if (userDetails.contains("chrome")) {
            resp.sendRedirect("https://www.google.com/intl/en_in/chrome/");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}