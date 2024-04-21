/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class ViewPersonServlet extends HttpServlet {
@EJB
private PersonClassFacadeLocal pcf;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      List<PersonClass> personList=pcf.findAll();
      request.setAttribute("personList", personList);
        RequestDispatcher disp=request.getRequestDispatcher("get_all_outcome.jsp");
        disp.forward(request, response);
    }

}
