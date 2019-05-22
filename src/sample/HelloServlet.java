package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        response.getWriter().append("Served at: ").append(request.getContextPath()+"<br>"+request.getParameter("name"));
        response.setContentType("text/html;charset=UTF-8");
        out.println("" +
                "<html>" +
                "<head><title>come on</title>" +
                "</head>" +
                "<body>" +
                "<br>" +
                "<h1>hello it's me</h1>" +
                "</body>" +
                "</html>");
    }
}
