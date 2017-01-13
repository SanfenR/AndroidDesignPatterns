package com.mz.sanfen.androiddesignpatterns.singleton.lazysingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2017/1/13.
 *
 * 使用容器实现单例
 *
 */

public class Singleton5Manager {
    private static Map<String, Object> objectMap = new HashMap<>();

    private Singleton5Manager (){}

    public static void registerService(String key, Object intance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, intance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
