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

/**
 *
 * @author Student
 */
public class GetSizePersonServlet extends HttpServlet {
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   @EJB
   private PersonClassFacadeLocal pcf;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      int size=pcf.count();
      request.setAttribute("size", size);
        RequestDispatcher disp=request.getRequestDispatcher("size_outcome.jsp");
        disp.forward(request, response);
    }


}
