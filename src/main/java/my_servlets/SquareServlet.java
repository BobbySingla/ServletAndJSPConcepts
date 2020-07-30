package my_servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Approach 1 to call servlet from servlet using RequestDispatcher
//        int k = (int) request.getAttribute("k");

//    Approach 2 to call servlet from servlet using sendRedirect
//        int k = Integer.parseInt(request.getParameter("k"));

        // we can send variable to another servlet using cookie
        int k = 0;
        Cookie cookie[] = request.getCookies();
        for (Cookie c : cookie) {
            if (c.getName().equals("k")) {
                k = Integer.parseInt(c.getValue());

            }
        }

        // we can send variable to another servlet using HTTPSession
//        HttpSession session = request.getSession();
//        int k = (int) (session.getAttribute("k"));
        k = k * k;
        PrintWriter out = response.getWriter();
        out.println(k);

    }
}
