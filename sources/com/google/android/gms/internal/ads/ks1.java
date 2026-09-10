package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ks1 f16518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ks1 f16519b;

    static {
        ks1 ks1Var = new ks1();
        Map map = Collections.EMPTY_MAP;
        f16519b = ks1Var;
    }

    public static ks1 a() {
        ks1 ks1Var = f16518a;
        if (ks1Var != null) {
            return ks1Var;
        }
        synchronized (ks1.class) {
            try {
                ks1 ks1Var2 = f16518a;
                if (ks1Var2 != null) {
                    return ks1Var2;
                }
                int i10 = tr1.f20473a;
                ks1 ks1VarY = ps1.y();
                f16518a = ks1VarY;
                return ks1VarY;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
