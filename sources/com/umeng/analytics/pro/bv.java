package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class bv {
    public static bu a(Class<? extends bu> cls, int i) {
        try {
            return (bu) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
