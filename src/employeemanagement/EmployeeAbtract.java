/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import model.Employee;

/**
 *
 * @author dangt
 */
public abstract class EmployeeAbtract {

    public abstract void addNew(Employee employee);
    
    public abstract void update(Employee employee);

    public abstract void delete(String id);

    public abstract void findIntern();

    public abstract void findExperience();

    public abstract void findFesher();
}
