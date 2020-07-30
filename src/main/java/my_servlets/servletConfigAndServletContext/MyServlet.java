package my_servlets.servletConfigAndServletContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ServletConfig servletConfig = getServletConfig();
        String name1 = servletConfig.getInitParameter("name");
        ServletContext servletContext = getServletContext();
        String name2 = servletContext.getInitParameter("name");
        PrintWriter out = response.getWriter();
        out.println(name1);
        out.println(name2);
    }
}
