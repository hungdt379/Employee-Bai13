/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import controller.EmployeeController;
import java.util.Scanner;

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
        int number;
        Scanner s = new Scanner(System.in);
        EmployeeController ec = new EmployeeController();
        while (true) {
            System.out.println("Employee Management");
            System.out.println("1. Add New Employee");
            System.out.println("2. Delete Employee By ID");
            System.out.println("3. Find all Fresher");
            System.out.println("4. Find all Experience");
            System.out.println("5. Find all Intern");
            System.out.println("6. Exit");
            System.out.println("Enter your selection: ");
            number = Integer.parseInt(s.nextLine());
            switch (number) {
                case 1:
                    
                case 2:
                    int nid;
                    System.out.println("Enter ID: ");
                    nid = Integer.parseInt(s.nextLine());
                    break;
                case 3:
                    ec.findFesher();
                    break;
                case 4:
                    ec.findExperience();
                    break;
                case 5:
                    ec.findIntern();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }

}
