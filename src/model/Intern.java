/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;




/**
 *
 * @author dangt
 */
public class Intern extends Employee{
    String major;
    String semester;
    String universityName;

    public Intern() {
        super();
    }

    public Intern(String major, String semester, String universityName, 
            String id, String fullName, String birthDay, String phone, 
            String email, String employeeType, String employeeCount) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    public String showMe(){
        return super.showInfor() + "\nmajor=" + major + "\nsemester=" + semester + "\nuniversityName=" + universityName + super.showCertificate();
    }
    
    @Override
    public String showInfor(){
        return super.showInfor() + "\nmajor=" + major + "\nsemester=" + semester + "\nuniversityName=" + universityName + super.showCertificate();
    }
    
}
