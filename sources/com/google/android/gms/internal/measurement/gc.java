package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gc extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23512a;

    public gc(int i10, String str, j9.e eVar) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(i10, 2) + str.length());
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i10);
        }
        super(strValueOf, eVar);
        this.f23512a = i10;
    }
}
