<%-- 
    Document   : index
    Created on : Aug 1, 2018, 1:17:40 AM
    Author     : Mohammed Rakayby
--%>

<%@page import="rakayby.servlettest.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--<%@ taglib prefix = "jstl" uri = "http://java.sun.com/jsp/jstl/core" %>--%>
        <title>${properties.applicationTitle}</title>
        
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>Author: ${properties.author}</h1>
        <div class="container">
           
            <h1>This is the user bean data</h1>
           
            <h2>welcome ${user.name}</h2>
            <h3>your mail is ${user.email}</h3>
        </div>
        <form action="home" method="post">
            <p>
                Name:<input type="text" name="Name"/>
            </p>
            <p>
                <input type="submit" value="Enter  name"/>
            </p>
        </form>
    </body>
</html>
