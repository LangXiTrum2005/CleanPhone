package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p40 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public p40(String str, z20 z20Var) {
        String strValueOf = String.valueOf(z20Var);
        super(q4.a.j(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
