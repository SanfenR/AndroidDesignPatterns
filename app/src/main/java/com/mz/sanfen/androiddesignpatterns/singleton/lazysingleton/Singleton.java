package com.mz.sanfen.androiddesignpatterns.singleton.lazysingleton;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 *
 * 懒汉式
 * 缺点:在调用getInstance()方法的时候同步，造成不必要的同步开销
 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
