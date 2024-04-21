<%-- 
    Document   : size_outcome
    Created on : 22 Apr 2024, 1:52:08 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Get Number of people </h1>
        <%
        Integer size=(Integer)request.getAttribute("size");
        
        %>
        <p>
            there are <b><%=size%> number of people in  the database</b>
               Please click <a href="menu.jsp">here</a> to proceed and go to menu or <a href="index.html">here</a> to start
        </p>
    </body>
</html>
