package com.mz.sanfen.androiddesignpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 */

public class Company {
    private List<Staff> allStaff = new ArrayList<>();

    public void addStaff(Staff per){
        allStaff.add(per);
    }

    public void showAllStaffs(){
        for (Staff per : allStaff) {
            System.out.println("Obj: " + per.toString());
        }
    }
}
