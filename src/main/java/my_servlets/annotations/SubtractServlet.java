package my_servlets.annotations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sub")
public class SubtractServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i - j;
        PrintWriter out=response.getWriter();
        out.println(k);
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
