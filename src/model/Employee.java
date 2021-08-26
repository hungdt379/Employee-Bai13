/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dangt
 */
public class Employee {

    private String id;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private String employeeType;
    private String employeeCount;
    public List<Certificate> certificates;

    public Employee() {
        certificates = new ArrayList<>();
    }

    public Employee(String id, String fullName, String birthDay, String phone,
            String email, String employeeType, String employeeCount) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.employeeCount = employeeCount;
        certificates = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(String employeeCount) {
        this.employeeCount = employeeCount;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public String showInfor() {
        return "\nid=" + id + "\nfullName=" + fullName + "\nbirthDay=" + birthDay + "\nphone=" + phone + "\nemail=" + email;
    }

    public String showCertificate() {
        String c = "\nCertificate: ";
        int count = 1;
        for (Certificate certificate : certificates) {
            c = c + "\nCertificated " + count
                    + "\n     CertificatedID: " + certificate.certificateId
                    + "\n     CertificateName: " + certificate.certificateName
                    + "\n     CertificateRank: " + certificate.certificateRank
                    + "\n     CertificateDate: " + certificate.certificateDate;
            count++;
        }
        return c;
    }
}
