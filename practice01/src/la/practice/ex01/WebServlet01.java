package la.practice.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WebServlet01 extends HttpServlet {

    public WebServlet01(){ super(); }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Welcome</title></head><body>");
        out.println("<h1>Welcome Servlet</h1>");
        out.println("<p>It is a subclass of HTTPServlet</p>");
        out.println("</body></html>");
    }

}
