<%-- 
    Document   : search_outcome
    Created on : 22 Apr 2024, 1:20:51 AM
    Author     : Student
--%>

<%@page import="za.ac.tut.entities.PersonClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Person Search</h1>
        <%
            PersonClass pc=(PersonClass)request.getAttribute("p");
        %>
        <p>
            <b><%=pc.getName()%> <%=pc.getSurname()%>, of id <%=pc.getId()%>, has been found</b>
              Please click <a href="menu.jsp">here</a> to proceed and go to menu or <a href="index.jsp">here</a> to start
        </p>
    </body>
</html>
