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
public class Experience extends Employee{
    private String expInYear;
    private String proSkill;

    public Experience() {
        super();
    }

    public Experience(String expInYear, String proSkill, String id, String fullName, 
            String birthDay, String phone, String email, String employeeType, 
            String employeeCount) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(String expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
    public String showMe(){
        return super.showInfor() + "\nexpInYear=" + expInYear + "\nproSkill=" + proSkill + super.showCertificate();
    }
    
}
