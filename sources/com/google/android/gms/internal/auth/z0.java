package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public static final y0 a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        y0 y0Var2 = (y0) obj2;
        if (!y0Var2.isEmpty()) {
            if (!y0Var.f22927a) {
                if (y0Var.isEmpty()) {
                    y0Var = new y0();
                } else {
                    y0 y0Var3 = new y0(y0Var);
                    y0Var3.f22927a = true;
                    y0Var = y0Var3;
                }
            }
            y0Var.g();
            if (!y0Var2.isEmpty()) {
                y0Var.putAll(y0Var2);
            }
        }
        return y0Var;
    }
}
