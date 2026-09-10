package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class eK {
    public static Method Lxb(String str, String str2, Class<?>... clsArr) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Class<?> clsLxb = Lxb(str);
            if (clsLxb != null) {
                return clsLxb.getMethod(str2, clsArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> Lxb(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, Lxb());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str, true, eK.class.getClassLoader());
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str);
        }
    }

    private static ClassLoader Lxb() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? eK.class.getClassLoader() : contextClassLoader;
    }
}
