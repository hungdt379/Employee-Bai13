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
public class Fresher extends Employee{
    private String graduationDate;
    private String graduationRank;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String id, 
            String fullName, String birthDay, String phone, String email, 
            String employeeType, String employeeCount) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
    
    public String showMe(){
        return super.showInfor() + "graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + super.showCertificate();
    }
    
    @Override
    public String showInfor(){
        return super.showInfor() + "graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + super.showCertificate();
    }
}
