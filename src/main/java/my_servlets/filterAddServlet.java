package my_servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/add")
public class filterAddServlet implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request =(HttpServletRequest) servletRequest;
        int i =Integer.parseInt(request.getParameter("num1"));
        PrintWriter out= servletResponse.getWriter();
        if (i>10)
        filterChain.doFilter(servletRequest,servletResponse);
        else
            out.println("Value of first no. should be Greater than 10");
    }
}
