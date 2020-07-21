package com.javapractice;

//Tightly Coupling Example
public class DriverClass {
    public static void main(String[] args) {
//Creating objects for all the dependency class
        Developer d = new Developer();
        TeamLead td = new TeamLead();
        JuniorDeveloper jd = new JuniorDeveloper();
        Manager m = new Manager(d, td, jd);
        m.managerWork();
    }
}
