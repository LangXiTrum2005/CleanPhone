package com.ironsource;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0420k4 {
    private final boolean b() {
        return true;
    }

    private final boolean c() {
        try {
            Class.forName("kotlinx.coroutines.test.TestScope");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final boolean d() {
        try {
            Method[] declaredMethods = fn.g.class.getDeclaredMethods();
            kotlin.jvm.internal.n.e(declaredMethods, "flowKtClass.declaredMethods");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.n.a(method.getName(), "chunked") && method.getParameterCount() == 2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final String a() {
        if (d()) {
            return "1.9.0+";
        }
        if (c()) {
            return "1.6.0-1.8.x";
        }
        return b() ? "1.3.0-1.5.x" : "<1.3.0";
    }
}
