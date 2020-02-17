import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Asus on 11/24/2019.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("link.html").include(request,response);
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if (password.equals("admin")){
            out.print("Login Successfully");
            Cookie ck=new Cookie("name",username);
            response.addCookie(ck);

        }
        else {
            out.print("sorry invalid username or password");
            request.getRequestDispatcher("login.html").include(request,response);

        }
    }
}
