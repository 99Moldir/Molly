package lab3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MyServlet1() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward the request to login.jsp
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the values from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // You can perform authentication logic here (replace with your own logic)

        // Forward the request to welcome.jsp
        request.setAttribute("username", username);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}