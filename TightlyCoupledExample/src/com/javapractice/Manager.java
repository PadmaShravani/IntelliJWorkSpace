package com.javapractice;
//This class is dependent class
public class Manager {
    Developer d;
    TeamLead td;
    JuniorDeveloper jd;
    public Manager(Developer d, TeamLead td, JuniorDeveloper jd) {
        this.d = d;
        this.td = td;
        this.jd = jd;
    }
    public void managerWork() {
        d.work();
        td.work();
        jd.work();
    }
}
