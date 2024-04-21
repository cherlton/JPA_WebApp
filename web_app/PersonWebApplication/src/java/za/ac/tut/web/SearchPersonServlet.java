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
public class SearchPersonServlet extends HttpServlet {
@EJB
private PersonClassFacadeLocal pcd;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      Long id=Long.parseLong(request.getParameter("id"));
      PersonClass pc=createPerson(id);
      PersonClass p=pcd.find(id);
      request.setAttribute("p", p);
      
        RequestDispatcher disp=request.getRequestDispatcher("search_outcome.jsp");
        disp.forward(request, response);
    }

    private PersonClass createPerson(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    PersonClass pc=new PersonClass();
    pc.setId(id);
    return pc;
    }

}
