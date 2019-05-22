package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/controller/LoginCheck")
public class LoginCheck extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginCheck() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String passwd = request.getParameter("pswd");

        if (email.equals("hajae@hajae.com") && passwd.equals("1234")) {
            HttpSession session = request.getSession();
            session.setAttribute("isLogin", "true");
            out.println("" +
                    "<html>" +
                    "<head><title>complete!!</title></head>" +
                    "<body>"+"<h1>complete!!</h1>"+"</body></html>");

        } else {
            out.print("login fail!!");
        }


    }
}
