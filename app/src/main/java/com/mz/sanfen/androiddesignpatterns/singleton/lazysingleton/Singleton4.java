package com.mz.sanfen.androiddesignpatterns.singleton.lazysingleton;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 *
 * 枚举单例
 *
 * 在Java中，默认的枚举实例的创建是线程安全的，并且在任何情况下它都是一个单例。
 */

public enum Singleton4 {
    INSTANCE;
    public void doSomething() {
        System.out.println("do sth");
    }
}

