package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile z0 f24189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f24190b;

    static {
        z0 z0Var = new z0();
        Map map = Collections.EMPTY_MAP;
        f24190b = z0Var;
    }

    public static z0 a() {
        z0 z0Var = f24189a;
        if (z0Var != null) {
            return z0Var;
        }
        synchronized (z0.class) {
            try {
                z0 z0Var2 = f24189a;
                if (z0Var2 != null) {
                    return z0Var2;
                }
                int i10 = n0.f23760a;
                z0 z0VarC = e1.c();
                f24189a = z0VarC;
                return z0VarC;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
