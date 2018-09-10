/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.servlettest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import rakayby.servettest.properties.ApplicationProperties;

/**
 *
 * @author Mohammed Rakayby
 */
@WebServlet(name="Controller")
public class Controller extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ApplicationProperties properties=new ApplicationProperties("ServletTesting","Rakayby");
        getServletContext().setAttribute("properties", properties);
                
    }

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user=new User();
        user.setAge(23);
        user.setEmail("hoop@hoppa");
        user.setName("moe");
        
        RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        req.setAttribute("user",user);
        requestDispatcher.forward(req, resp);
        
    }

    
}
