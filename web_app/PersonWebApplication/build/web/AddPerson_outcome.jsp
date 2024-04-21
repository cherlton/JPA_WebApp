<%-- 
    Document   : AddPerson_outcome
    Created on : 21 Apr 2024, 11:57:39 PM
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
        <h1>Add Person Outcome!</h1>
        <%
        String name=(String)request.getAttribute("name");
        String surname=(String)request.getAttribute("surname");
        
%>
<p>
    <b><%=name%> <%=surname%></b>,was added successfully persisted to the database
    Please click <a href="menu.jsp">here</a> to proceed and go to menu or <a href="index.jsp">here</a> to start
</p>
    </body>
</html>
