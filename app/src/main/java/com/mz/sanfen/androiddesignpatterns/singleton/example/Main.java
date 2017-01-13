package com.mz.sanfen.androiddesignpatterns.singleton.example;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 */

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Staff ceo1 = CEO.getCeo();
        Staff ceo2 = CEO.getCeo();
        company.addStaff(ceo1);
        company.addStaff(ceo2);

        Staff vp1 = new VP();
        Staff vp2 = new VP();

        company.addStaff(vp1);
        company.addStaff(vp2);

        Staff staff1 = new Staff();
        Staff staff2 = new Staff();

        company.addStaff(staff1);
        company.addStaff(staff2);

        company.showAllStaffs();
    }
}
