/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import employeemanagement.EmployeeAbtract;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import model.Experience;
import model.Fresher;
import model.Intern;

/**
 *
 * @author dangt
 */
public class EmployeeController extends EmployeeAbtract{
    List<Employee> employees = new ArrayList<>();
    
    @Override
    public void addNew(){
        
    }
    
    @Override
    public void delete(String id){
        employees.stream().filter((employee) -> (employee.getId().equals(id))).forEachOrdered((employee) -> {
            employees.remove(employee);
        });
    }
    
    @Override
    public void findIntern(){
        employees.stream().filter((employee) -> (employee instanceof Intern)).forEachOrdered((employee) -> {
            System.out.println(employee.showInfor());
        });
    }
    
    @Override
    public void findExperience(){
        employees.stream().filter((employee) -> (employee instanceof Experience)).forEachOrdered((employee) -> {
            System.out.println(employee.showInfor());
        });
    }
    
    @Override
    public void findFesher(){
        employees.stream().filter((employee) -> (employee instanceof Fresher)).forEachOrdered((employee) -> {
            System.out.println(employee.showInfor());
        });
    }
}
