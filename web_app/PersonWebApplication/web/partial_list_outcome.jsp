<%-- 
    Document   : get_all_outcome
    Created on : 22 Apr 2024, 1:26:05 AM
    Author     : Student
--%>


<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.PersonClass"%>
<%@page import="za.ac.tut.entities.PersonClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View all list</h1>
        <%
        List<PersonClass>listPerson=(List<PersonClass>)request.getAttribute("listPerson");
        Integer endIndex=(Integer)request.getAttribute("endIndex");
        Integer startIndex=(Integer)request.getAttribute("startIndex");
        %>
        <p>
            below is the list of the people in the database:
            from <b><%=startIndex%></b>index to <b><%=endIndex%></b> 
        </p>
        <table border="1">
           <%
           for(int x=0;x<listPerson.size();x++){
               String name=listPerson.get(x).getName();
               String surname=listPerson.get(x).getSurname();
               String gender=listPerson.get(x).getGender();
               Long id=listPerson.get(x).getId();
           
           %>
            <tbody>
                <tr>
                    <td>Name:</td>
                    <td><%=name%></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><%=surname%></td>
                </tr>
                <tr>
                    <td>gender:</td>
                    <td><%=gender%></td>
                </tr>
                <tr>
                    <td>ID:</td>
                    <td><%=id%></td>
                </tr>
            </tbody>
            <%
                }%>
        </table>
Please click <a href="menu.jsp">here</a> to proceed and go to menu or <a href="index.html">here</a> to start

    </body>
</html>
