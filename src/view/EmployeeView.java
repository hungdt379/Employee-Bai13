/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import common.BirthDayException;
import common.Common;
import common.EmailException;
import common.InputNumberException;
import common.NameException;
import common.PhoneException;
import controller.EmployeeController;
import java.util.Scanner;
import model.Certificate;
import model.Employee;
import model.Experience;
import model.Fresher;
import model.Intern;

/**
 *
 * @author dangt
 */
public class EmployeeView {

    EmployeeController ec = new EmployeeController();
    Common common = new Common();
    Scanner s = new Scanner(System.in);

    public void viewAddCertificate(Employee employee) {
        System.out.println("Enter number of certificate: ");
        String nc = s.nextLine();
        while (true) {
            try {
                common.checkInputNumber(nc, 0, 100);
                break;
            } catch (InputNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (Integer.parseInt(nc) > 0) {
            int countCertificate = 1;
            while (true) {
                System.out.println("Certificate " + countCertificate);
                System.out.println("Enter certificate id");
                String certificateId = s.nextLine();
                System.out.println("Enter certificate name");
                String certificateName = s.nextLine();
                System.out.println("Enter certificate rank");
                String certificateRank = s.nextLine();
                System.out.println("Enter certificate date");
                String certificateDate = s.nextLine();
                Certificate certificate = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
                employee.certificates.add(certificate);
                countCertificate++;
                if (countCertificate > Integer.parseInt(nc)) {
                    break;
                }
            }
        }

    }

    public void viewAddFresherGraduation(Fresher fresher) {
        System.out.println("Graduation ");
        System.out.println("Enter graduation date");
        String graduationDate = s.nextLine();
        System.out.println("Enter graduation rank");
        String graduationRank = s.nextLine();
        fresher.setGraduationDate(graduationDate);
        fresher.setGraduationRank(graduationRank);
    }

    public void viewAddExperienceSkil(Experience experience) {
        System.out.println("Enter experience in year");
        String expInYear = s.nextLine();
        System.out.println("Enter pro skill");
        String proSkill = s.nextLine();
        experience.setExpInYear(expInYear);
        experience.setProSkill(proSkill);
    }

    public void viewAddInformationInter(Intern intern) {
        System.out.println("Enter major");
        String major = s.nextLine();
        System.out.println("Enter semester");
        String semester = s.nextLine();
        System.out.println("Enter university name");
        String universityName = s.nextLine();
        intern.setMajor(major);
        intern.setSemester(semester);
        intern.setUniversityName(universityName);
    }

    public void viewAddEmployee() {
        System.out.println("Enter ID");
        String id = s.nextLine();
        String fullName;
        while (true) {
            System.out.println("Enter full name");
            fullName = s.nextLine();
            try {
                common.checkName(fullName);
                break;
            } catch (NameException ex) {
                System.out.println(ex.getMessage());
            }

        }

        String birthDay;
        while (true) {
            System.out.println("Enter birthday");
            birthDay = s.nextLine();
            try {
                common.checkDate(birthDay);
                break;
            } catch (BirthDayException ex) {
                System.out.println(ex.getMessage());
            }
        }

        String phone;
        while (true) {
            System.out.println("Enter phone");
            phone = s.nextLine();
            try {
                common.checkPhone(phone);
                break;
            } catch (PhoneException ex) {
                System.out.println(ex.getMessage());
            }
        }

        String email;
        while (true) {
            System.out.println("Enter email");
            email = s.nextLine();
            try {
                common.checkEmail(email);
                break;
            } catch (EmailException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("Select employee type");
        System.out.println("1. Fresher");
        System.out.println("2. Experience");
        System.out.println("3. Intern");
        System.out.println("Enter your selection: ");
        String ne = s.nextLine();
        while (true) {
            try {
                common.checkInputNumber(ne, 1, 3);
                break;
            } catch (InputNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }
        switch (Integer.parseInt(ne)) {
            case 1:
                Fresher fresher = new Fresher();
                fresher.setId(id);
                fresher.setFullName(fullName);
                fresher.setPhone(phone);
                fresher.setEmail(email);
                fresher.setBirthDay(birthDay);
                fresher.setEmployeeType(Common.EMPLOYEE_FRESHER);
                viewAddFresherGraduation(fresher);
                viewAddCertificate(fresher);
                ec.addNew(fresher);
                System.out.println("Insert fresher employee successfull");
                break;
            case 2:
                Experience experience = new Experience();
                experience.setId(id);
                experience.setFullName(fullName);
                experience.setPhone(phone);
                experience.setEmail(email);
                experience.setBirthDay(birthDay);
                experience.setEmployeeType(Common.EMPLOYEE_EXPERIENCE);
                viewAddExperienceSkil(experience);
                viewAddCertificate(experience);
                ec.addNew(experience);
                System.out.println("Insert experience employee successfull");
                break;
            case 3:
                Intern intern = new Intern();
                intern.setId(id);
                intern.setFullName(fullName);
                intern.setPhone(phone);
                intern.setEmail(email);
                intern.setBirthDay(birthDay);
                intern.setEmployeeType(Common.EMPLOYEE_INTERN);
                viewAddCertificate(intern);
                viewAddInformationInter(intern);
                ec.addNew(intern);
                System.out.println("Insert intern employee successfull");
                break;
            default:
                break;
        }
    }
    
    public void viewUpdateEmployee(Employee employee){
        
    }

    public void viewEmployeeManagement() {

        while (true) {
            System.out.println("Employee Management");
            System.out.println("1. Add New Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee By ID");
            System.out.println("4. Find all Fresher");
            System.out.println("5. Find all Experience");
            System.out.println("6. Find all Intern");
            System.out.println("7. Export file");
            System.out.println("8. Exit");
            String sn;
            while (true) {
                try {
                    System.out.println("Enter your selection: ");
                    sn = s.nextLine();
                    common.checkInputNumber(sn, 1, 6);
                    break;
                } catch (InputNumberException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            int number = Integer.parseInt(sn);
            if (number == 1) {
                viewAddEmployee();
            } else if (number == 2) {

            } else if (number == 3) {
                System.out.println("Enter ID: ");
                String nid = s.nextLine();
                ec.delete(nid);
            } else if (number == 4) {
                ec.findFesher();
            } else if (number == 5) {
                ec.findExperience();
            } else if (number == 6) {
                ec.findIntern();
            } else if (number == 8) {
                System.exit(0);
            }

        }
    }

}
