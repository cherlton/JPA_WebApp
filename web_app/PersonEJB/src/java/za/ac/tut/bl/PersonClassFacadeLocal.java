/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.PersonClass;

/**
 *
 * @author Student
 */
@Local
public interface PersonClassFacadeLocal {

    void create(PersonClass personClass);

    void edit(PersonClass personClass);

    void remove(PersonClass personClass);

    PersonClass find(Object id);

    List<PersonClass> findAll();

    List<PersonClass> findRange(int[] range);

    int count();
    
}
