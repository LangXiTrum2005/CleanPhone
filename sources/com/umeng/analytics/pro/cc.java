package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class cc implements Serializable {
    private static Map<Class<? extends bq>, Map<? extends bx, cc>> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2532a;
    public final byte b;
    public final cd c;

    public cc(String str, byte b, cd cdVar) {
        this.f2532a = str;
        this.b = b;
        this.c = cdVar;
    }

    public static void a(Class<? extends bq> cls, Map<? extends bx, cc> map) {
        d.put(cls, map);
    }

    public static Map<? extends bx, cc> a(Class<? extends bq> cls) {
        if (!d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return d.get(cls);
    }
}
