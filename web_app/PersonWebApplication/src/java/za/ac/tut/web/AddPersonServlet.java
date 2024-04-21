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
import za.ac.tut.bl.PersonClassFacade;
import za.ac.tut.bl.PersonClassFacadeLocal;
import za.ac.tut.entities.PersonClass;

/**
 *
 * @author Student
 */
public class AddPersonServlet extends HttpServlet {
@EJB
private PersonClassFacadeLocal pcd;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String name=request.getParameter("name");
      String surname=request.getParameter("surname");
      String gender=request.getParameter("gender");
      PersonClass pc=creatPerson(name,surname,gender);
      pcd.create(pc);
      request.setAttribute("name", name);
      request.setAttribute("surname", surname);
        RequestDispatcher disp=request.getRequestDispatcher("AddPerson_outcome.jsp");
        
        disp.forward(request, response);
    }

    private PersonClass creatPerson(String name,String surname,String gender) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    PersonClass pc = new PersonClass();
    pc.setName(name);
    pc.setSurname(surname);
   pc.setGender(gender);
    return pc;
    }


}
