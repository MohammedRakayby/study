<%-- 
    Document   : errorpage.jsp
    Created on : Aug 4, 2018, 1:38:17 PM
    Author     : Mohammed Rakayby
--%>
<%@page isErrorPage="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is error page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>this is the error page</h1>
        <h3><%=exception.getMessage()%></h3>
        
    </body>
</html>
