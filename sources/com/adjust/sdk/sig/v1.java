package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {
    public static u1 a(g0 g0Var) {
        int iA = w1.a(2);
        if (iA == 0) {
            return new j3(g0Var);
        }
        if (iA == 1) {
            return new k2(g0Var);
        }
        if (iA == 2) {
            return new n3(g0Var);
        }
        throw new y1();
    }
}
