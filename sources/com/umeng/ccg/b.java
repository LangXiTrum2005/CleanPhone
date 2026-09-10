package com.umeng.ccg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f2616a = true;
    private static volatile boolean b = true;
    private static volatile boolean c = true;
    private static volatile boolean d = true;
    private static volatile boolean e = true;
    private static Map<String, Boolean> g = new HashMap();
    private static Object f = new Object();

    public static boolean a() {
        boolean z;
        synchronized (f) {
            z = f2616a;
        }
        return z;
    }

    public static boolean b() {
        boolean z;
        synchronized (f) {
            z = b;
        }
        return z;
    }

    public static boolean c() {
        boolean z;
        synchronized (f) {
            z = c;
        }
        return z;
    }

    public static boolean d() {
        boolean z;
        synchronized (f) {
            z = d;
        }
        return z;
    }

    public static void a(boolean z) {
        synchronized (f) {
            d = z;
            g.put(a.e, Boolean.valueOf(z));
        }
    }

    public static void b(boolean z) {
        synchronized (f) {
            e = z;
            g.put(a.i, Boolean.valueOf(z));
        }
    }

    public static boolean a(String str) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                zBooleanValue = g.containsKey(str) ? g.get(str).booleanValue() : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }
}
