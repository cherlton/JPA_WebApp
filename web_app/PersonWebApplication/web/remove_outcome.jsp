<%-- 
    Document   : remove_outcome
    Created on : 22 Apr 2024, 1:47:18 AM
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
        <h1>Remove Person!</h1>
        <%
        Long id=(Long)request.getAttribute("id");
        
        %>
        <p>
            <b><%=id%>, person with the id is removed</b>
            Please click <a href="menu.jsp">here</a> to proceed and go to menu or <a href="index.html">here</a> to start
        </p>
    </body>
</html>
