package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CheckInfo")
public class CheckInfo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CheckInfo() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session != null) {
            String name = (String) session.getAttribute("name");
            String address = (String) session.getAttribute("address");
            String phone = (String) session.getAttribute("phone");

            out.println("name:"+name);
            out.println("address:"+address);
            out.println("phone:"+phone);
        } else {
            out.println("Please register your name, address and phone number.");
        }


    }
}
