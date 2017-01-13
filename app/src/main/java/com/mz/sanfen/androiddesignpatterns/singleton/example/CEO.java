package com.mz.sanfen.androiddesignpatterns.singleton.example;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 */

public class CEO extends Staff {
    private static final CEO mCeo = new CEO();


    public static CEO getCeo() {
        return mCeo;
    }




    @Override
    public void work() {
        super.work();
    }
}
