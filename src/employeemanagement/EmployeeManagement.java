/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import view.EmployeeView;

/**
 *
 * @author dangt
 */
public class EmployeeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeView employeeView = new EmployeeView();
        employeeView.viewEmployeeManagement();
    }
}
