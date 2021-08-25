/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author dangt
 */
public class Common {
    public static final String EMPLOYEE_FRESHER = "Fresher";
    public static final String EMPLOYEE_INTERN = "Intern";
    public static final String EMPLOYEE_EXPERIENCE = "Experience";
    public static final String VALID_EMAIL_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    public static final String VALID_NAME_REGEX = "[a-z\\s]{50}$";
    public static final String VALID_PHONE_NUMBER_REGEX = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
    public static final String VALID_BIRTHDAY_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";
    
    public void checkPhone(String str) throws PhoneException {
        if (str.matches(Common.VALID_PHONE_NUMBER_REGEX)) {
            throw new PhoneException("Invalid phone number");
        } else {
            System.out.println("Phone number accepted");
        }
    }
    
    public void checkName(String str) throws PhoneException {
        if (str.matches(Common.VALID_NAME_REGEX)) {
            throw new PhoneException("Invalid Name");
        } else {
            System.out.println("Name accepted");
        }
    }
    
    public void checkEmail(String str) throws PhoneException {
        if (str.matches(Common.VALID_EMAIL_REGEX)) {
            throw new PhoneException("Invalid Email");
        } else {
            System.out.println("Email accepted");
        }
    }
    
    public void checkDate(String str) throws PhoneException {
        if (str.matches(Common.VALID_BIRTHDAY_REGEX)) {
            throw new PhoneException("Invalid Date");
        } else {
            System.out.println("Date accepted");
        }
    }
}
