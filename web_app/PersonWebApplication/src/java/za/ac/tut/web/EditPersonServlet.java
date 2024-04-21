/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.PersonClassFacadeLocal;
import za.ac.tut.entities.PersonClass;

/**
 *
 * @author Student
 */
public class EditPersonServlet extends HttpServlet {
@EJB
private PersonClassFacadeLocal pcfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      Long id=Long.parseLong(request.getParameter("id"));
    String name=request.getParameter("name");
        PersonClass pc=createPerson(name,id);
      pcfl.edit(pc);
      request.setAttribute("id", id);
        RequestDispatcher disp=request.getRequestDispatcher("edit_outcome.jsp");
        disp.forward(request, response);
    }

    private PersonClass createPerson(String name, Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    PersonClass pc=new PersonClass();
    pc.setName(name);
    pc.setId(id);
    return pc;
    }


}
