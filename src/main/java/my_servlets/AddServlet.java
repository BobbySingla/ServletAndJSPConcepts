package my_servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i + j;

        // we can send variable to another servlet using cookie
        Cookie cookie = new Cookie("k", k + "");
        response.addCookie(cookie);


        // we can send variable to another servlet using HTTPSession
        HttpSession session = request.getSession();
        session.setAttribute("k", k);

        response.sendRedirect("sqr");

//        Approach 2 to call servlet from servlet using sendRedirect
//        response.sendRedirect("sqr?k="+k);

//        Approach 1 to call servlet from servlet using RequestDispatcher
//        request.setAttribute("k", k);
//
//        RequestDispatcher rd = request.getRequestDispatcher("/sqr");
//        rd.forward(request, response);
    }


//    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int i = Integer.parseInt(request.getParameter("num1"));
//        int j = Integer.parseInt(request.getParameter("num2"));
//        int k = i + j;
//        PrintWriter out = response.getWriter();
//        out.println(k);
//
//    }
}
