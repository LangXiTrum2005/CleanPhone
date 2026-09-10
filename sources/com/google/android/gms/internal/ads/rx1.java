package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rx1 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx1(String str) {
        super(str);
        k9.c0.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx1(String str, Throwable th2) {
        super(str, th2);
        k9.c0.f(str, "Detail message must not be empty");
    }
}
