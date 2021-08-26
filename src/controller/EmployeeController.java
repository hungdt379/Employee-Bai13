/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import employeemanagement.EmployeeAbtract;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import model.Experience;
import model.Fresher;
import model.Intern;

/**
 *
 * @author dangt
 */
public class EmployeeController extends EmployeeAbtract {
    
    List<Employee> employees = new ArrayList<>();
    
    @Override
    public void addNew(Employee employee) {
        employees.add(employee);
    }
    
    @Override
    public void update(Employee employee) {
        Employee oldEmployee = getEmployeeByID(employee.getId());
        for (Employee e : employees) {
            if (oldEmployee.getId().equals(e.getId())) {
                employees.remove(e);
                break;
            }
        }
        employees.add(employee);
        System.out.println("Update Successfull");
    }
    
    @Override
    public void delete(String id) {
        int countDelete = 0;
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                countDelete++;
                employees.remove(employee);
            }
        }
        if (countDelete == 0) {
            System.out.println("Not found Employee");
        }
        if (countDelete != 0) {
            System.out.println("Delete Successfull");
        }
    }
    
    @Override
    public void findIntern() {
        int countIntern = 0;
        for (Employee employee : employees) {
            if (employee instanceof Intern) {
                countIntern++;
                System.out.println(employee.showInfor());
            }
        }
        if (countIntern == 0) {
            System.out.println("Not found Intern");
        }
        
    }
    
    @Override
    public void findExperience() {
        int countExperience = 0;
        for (Employee employee : employees) {
            if (employee instanceof Experience) {
                countExperience++;
                System.out.println(employee.showInfor());
            }
        }
        if (countExperience == 0) {
            System.out.println("Not found Experience");
        }
        
    }
    
    @Override
    public void findFesher() {
        int countFresher = 0;
        for (Employee employee : employees) {
            if (employee instanceof Fresher) {
                countFresher++;
                System.out.println(employee.showInfor());
            }
        }
        if (countFresher == 0) {
            System.out.println("Not found Fresher");
        }
    }
    
    public Employee getEmployeeByID(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
    
    public void exportFile() {
        File file = new File("D:\\Employee.txt");
        if (file.exists()) {
            file.delete();
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\Employee.txt");
            String out = "";
            for (Employee employee : employees) {
                out += employee.showInfor();
            }
            fw.write(out);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
