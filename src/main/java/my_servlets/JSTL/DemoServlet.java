package my_servlets.JSTL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Student> students = Arrays.asList(new Student("abhi1", 1), new Student("Abhi2", 2), new Student("ahi", 3));
        String key = "value";
        request.setAttribute("student", students);
        request.setAttribute("label", key);

//        RequestDispatcher rd = request.getRequestDispatcher("jsp_files/coreTags.jsp");
//        RequestDispatcher rd = request.getRequestDispatcher("jsp_files/sqlTags.jsp");
        RequestDispatcher rd = request.getRequestDispatcher("jsp_files/functionsTags.jsp");

        rd.forward(request, response);
    }
}
