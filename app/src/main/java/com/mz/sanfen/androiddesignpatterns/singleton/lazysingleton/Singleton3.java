package com.mz.sanfen.androiddesignpatterns.singleton.lazysingleton;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 *
 * 静态内部类单例模式
 *
 * 当第一次加载Singleton类时不会初始化sInstance, 只有在第一次调用Singleton的getInstance()方法时才会导致sInstance被初始化。
 * 因此，第一次调用getInstance()方法会导致虚拟机加载Singleton3Holder类，保证了线程安全和单例对象唯一。
 */

public class Singleton3 {
    private Singleton3(){}
    public static Singleton3 getInstance() {
        return Singleton3Holder.sInstance;
    }

    public static class Singleton3Holder {
        private static final Singleton3 sInstance = new Singleton3();
    }

}
