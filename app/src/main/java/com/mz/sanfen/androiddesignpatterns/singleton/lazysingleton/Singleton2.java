package com.mz.sanfen.androiddesignpatterns.singleton.lazysingleton;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 *
 * double checkLock 实现单例(DLC)
 * 优点:资源利于率高
 * 缺点:第一次加载的反应较慢，由于java内存模型的原因偶尔会失败。在高并发环境下有一定缺陷。
 */

public class Singleton2 {
    private static Singleton2 sInstance;
    private Singleton2() {}

    public static Singleton2 getsInstance() {
        if (sInstance == null) {
            synchronized (Singleton2.class) {
                if (sInstance == null) {
                    sInstance = new Singleton2();
                }
            }
        }

        return sInstance;
    }
}
