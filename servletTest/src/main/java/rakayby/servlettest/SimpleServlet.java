package rakayby.servlettest;

import java.io.IOException;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohammed Rakayby
 */
//mapping using annotation
@WebServlet(name="servletTest",urlPatterns = {"/home"})
//the url pattern defined in web.xml overrides whatever url patterns defined here^^
public class SimpleServlet extends HttpServlet {
     String initParam="";
     String contextParam="";

    @Override
    public void init() throws ServletException {
        initParam=getInitParameter("Param");
        contextParam=getServletContext().getInitParameter("contextParam");
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Name");
        if (name != null && !name.isEmpty()) {
            resp.getWriter().write("Hello " + name+"\n"+initParam+"\n"+contextParam);
        }
        else{
            throw new ServerException("Enter A name!!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Name");
        if (name != null && !name.isEmpty()) {
            resp.getWriter().write("Hello " + name);
        }else
            resp.sendRedirect("index.jsp");
    }
    

}
